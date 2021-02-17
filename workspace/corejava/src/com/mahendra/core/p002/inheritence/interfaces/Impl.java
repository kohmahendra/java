package com.mahendra.core.p002.inheritence.interfaces;

public class Impl implements IOne, ITwo {

	/*
	 * Must override the default method (as it exists in both interfaces). Java
	 * solves diamond problem by overriding and referring default method interface
	 * name
	 */

	@Override
	public void m1() {
		IOne.super.m1();
	}

	@Override
	public void m2() {
		System.out.println("Impl.m2");
	}

}
