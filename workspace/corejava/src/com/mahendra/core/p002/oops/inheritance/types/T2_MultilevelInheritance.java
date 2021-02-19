package com.mahendra.core.p002.oops.inheritance.types;

	class T2One {
		public void m1() {
			System.out.println("T2One. m1()");
		}
	}
	
	class T2Two extends T2One {
		public void m2() {
			System.out.println("T2Two. m2()");
		}
	}
	
	class T2Three extends T2Two {
		public void m3() {
			System.out.println("T2Three. m3()");
		}
	}
	
	public class T2_MultilevelInheritance {
		public static void main(String[] args) {
			T2Three g = new T2Three();
			g.m1();
			g.m2();
			g.m1();
		}
	}
