package com.mahendra.core.p002.oops;

//Short Encapsulation
class Product {
	private int id; // private means encapsulated

	private String description; // private means encapsulated

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

public class EncapsulationExample {
	public static void main(String[] args) {
		Product p = new Product();
		p.setId(1);
		p.setDescription("IPhone");
		System.out.println(p.getDescription());

	}

}