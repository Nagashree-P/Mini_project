package com.lulu.finalminiproject.sportsproduct.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lulu.finalminiproject.sportsproduct.entity.Product;
import com.lulu.finalminiproject.sportsproduct.repo.ProductRepo;

import jakarta.persistence.EntityNotFoundException;


@RequestMapping
@RestController

public class MyController {
	@Autowired
	ProductRepo productRepository;
	
	@GetMapping("/getProduct")
	public List<Product> getJPQL() {

		return productRepository.findAll(); // select * from <TableName>;

	}
	
	@PostMapping("/addProduct")
	public Product createuser(@RequestBody Product prod) {
		return productRepository.save(prod);
	}
	

	
	
	@DeleteMapping("/deleteProduct/{id}")
	public void deletProduct(@PathVariable("id") Integer id  ) {
		productRepository.deleteById(id); // select * from <TableName>;

	}
	@PutMapping("/updateProduct/{id}")

	public Product updatePurchase(@PathVariable int id, @RequestBody Product updatedProduct) {

	    Optional<Product> existingProduct = productRepository.findById(id);

 

	    if (existingProduct.isPresent()) {

	        Product productToUpdate = existingProduct.get();

	        

	        // Update the fields of the existing product with the new data

	        if (updatedProduct.getCost() != 0.0) {

	            productToUpdate.setCost(updatedProduct.getCost());

	        }
	        
	        if (updatedProduct.getDest() != null) {

	            productToUpdate.setDest(updatedProduct.getDest());

	        }
	        
	        if (updatedProduct.getName() != null) {

	            productToUpdate.setName(updatedProduct.getName());

	        }

 

	        // Save the updated product to the repository

	        return productRepository.save(productToUpdate);

	    } else {

	        // Handle the case where the product with the given ID doesn't exist

	        throw new EntityNotFoundException("Sports Product with ID " + id + " not found");

	    }

	}

}
