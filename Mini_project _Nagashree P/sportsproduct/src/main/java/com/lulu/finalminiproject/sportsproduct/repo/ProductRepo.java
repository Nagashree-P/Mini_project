package com.lulu.finalminiproject.sportsproduct.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulu.finalminiproject.sportsproduct.entity.Product;



public interface ProductRepo extends JpaRepository<Product, Integer>  {

}
