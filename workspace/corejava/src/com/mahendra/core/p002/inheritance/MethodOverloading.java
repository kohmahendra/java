package com.mahendra.core.p002.inheritance;

public class MethodOverloading {

	public static void main(String[] args) {
		add(1, 2);
		add(1.0, 2.0);
		float i = 2;
		float j = 2;
		add(i, j);
	}

	public static void add(int i, int j) {
		System.out.println("int add " + (i + j));
	}

	public static void add(float i, float j) {
		System.out.println("float add " + (i + j));
	}

	public static void add(double i, double j) {
		System.out.println("double add " + (i + j));
	}

}
