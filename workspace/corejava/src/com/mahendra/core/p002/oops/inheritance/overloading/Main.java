package com.mahendra.core.p002.oops.inheritance.overloading;

class Derived {
	public void getDetails() {
		System.out.printf("Derived class ");
	}
}

public class Main extends Derived {
	public void getDetails() {
		System.out.printf("Test class ");
		super.getDetails();
	}

	public static void main(String[] args) {
		Derived obj = new Main();
		obj.getDetails();
	}
}