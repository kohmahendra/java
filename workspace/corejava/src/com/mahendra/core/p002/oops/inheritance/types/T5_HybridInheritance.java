package com.mahendra.core.p002.oops.inheritance.types;

interface T5IOne {
	public void m1();
}

interface T5ITtwo extends T5IOne {
	public void m1();
}

interface T5IThree extends T5IOne {
	public void m1();
}

public class T5_HybridInheritance implements T5ITtwo, T5IThree {

	@Override
	public void m1() {

	}

}
