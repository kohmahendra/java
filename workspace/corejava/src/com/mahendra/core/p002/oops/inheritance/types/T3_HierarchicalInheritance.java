package com.mahendra.core.p002.oops.inheritance.types;

class T3One {
	public void m1() {
		System.out.println("T1One. m1()");
	}
}

class T3Two extends T3One {
	public void m2() {
		System.out.println("T3Two. m1()");
	}
}

class T3Three extends T3One {
	public void m3() {
		System.out.println("T3Three. m1()");
	}
}

class T3Four extends T3One {
	public void m4() {
		System.out.println("T3Four. m1()");
	}
}

public class T3_HierarchicalInheritance {
	public static void main(String args[]) {
		T3Two t3TwoObj = new T3Two();
		T3Three t3ThreeObj = new T3Three();
		T3Four t3FourObj = new T3Four();
		// All classes can access the method of class A
		t3TwoObj.m1();
		t3ThreeObj.m1();
		t3FourObj.m1();
	}
}
