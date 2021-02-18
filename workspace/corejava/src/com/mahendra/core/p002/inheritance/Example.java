package com.mahendra.core.p002.inheritance;

public class Example {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;

		String s1 = "Hello";
		String s2 = " World!";

		int k = i + j; // + is used for adding numbers
		String output = s1 + s2; // + is used for concatenating strings

		/*
		 * Here + is used as operator overloading (by Java internals. 
		 * A developer can't overload an operator
		 */
		System.out.println(k);
		System.out.println(output);

	}
}
