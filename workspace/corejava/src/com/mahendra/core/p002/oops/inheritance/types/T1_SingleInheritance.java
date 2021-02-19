package com.mahendra.core.p002.oops.inheritance.types;

class T1One {
	public void m1() {
		System.out.println("T1One. m1()");
	}
}

class T1Two extends T1One {
	public void m2() {
		System.out.println("T1Two. m2()");
	}
}

// Driver class
public class T1_SingleInheritance {
	public static void main(String[] args) {
		T1Two g = new T1Two();
		g.m1();
		g.m2();
		g.m1();
	}
}