package com.mahendra.core.p002.oops.inheritance;

class Demo {
	public void show(int x) {
		System.out.println("In int" + x);
	}

	public void show(String s) {
		System.out.println("In String" + s);
	}

	public void show(byte b) {
		System.out.println("In byte" + b);
	}
}

class UseDemo {
	public static void main(String[] args) {
		byte a = 25;
		Demo obj = new Demo();
		obj.show(a); // it will go to
		// byte argument
		obj.show("hello"); // String
		obj.show(250); // int
		obj.show('A');
		/*
		 * Since char is not available, so the data type higher than char in terms of
		 * range is int.
		 */
		obj.show("A"); // String
		/*
		 * since float data type is not available and so it's higher data type, so at
		 * this step their will be an error.
		 */
		//obj.show(7.5);
	}
}
