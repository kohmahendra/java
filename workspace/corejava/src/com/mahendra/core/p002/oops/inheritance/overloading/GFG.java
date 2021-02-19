package com.mahendra.core.p002.oops.inheritance.overloading;

public class GFG {
	// Overloaded methods
	public void fun(Integer i) {
		System.out.println("fun(Integer ) ");
	}

	public void fun(String name) {
		System.out.println("fun(String ) ");
	}

	// Driver code
	public static void main(String[] args) {
		GFG mv = new GFG();

		Integer arg = null;

		// No compiler error
		mv.fun(arg);
	}
}