package com.mahendra.core.p002.inheritence.interfaces;

public interface IOne extends SuperInterface {
	default void m1() {
		System.out.println("IOne.m1()");
	}
}
