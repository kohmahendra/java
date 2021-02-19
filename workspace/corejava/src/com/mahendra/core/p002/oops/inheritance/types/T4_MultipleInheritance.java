package com.mahendra.core.p002.oops.inheritance.types;

interface IOne {
	public void m1();
}

interface ITtwo {
	public void m1();
}

interface IThree extends IOne, ITtwo {
	public void m1();
}

class Child implements IThree {
	@Override
	public void m1() {
		System.out.println("Child.m1()");
	}

	public void m2() {
		System.out.println("Child.m2()");
	}
}

public class T4_MultipleInheritance {

	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
		c.m1();
	}

}
