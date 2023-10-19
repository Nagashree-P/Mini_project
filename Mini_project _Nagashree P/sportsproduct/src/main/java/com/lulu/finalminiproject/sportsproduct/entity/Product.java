package com.lulu.finalminiproject.sportsproduct.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")

public class Product {
	@Id
	int id;
	String name;
	float cost;
	String dest;
	public Product() {
		
	}
	public Product(int id, String name, float cost, String dest) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.dest = dest;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", dest=" + dest + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cost, dest, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Float.floatToIntBits(cost) == Float.floatToIntBits(other.cost) && Objects.equals(dest, other.dest)
				&& id == other.id && Objects.equals(name, other.name);
	}
	

}
