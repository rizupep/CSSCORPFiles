//By using this();

package com.expgms;

public class constructorOverLoadingExample {

	public int a, b, c;

	public constructorOverLoadingExample() {

		System.out.println("First Constructor");

	}

	public constructorOverLoadingExample(int a, int b) {

		System.out.println("Second Constructor");
		System.out.println("Value of A" + a);
		System.out.println("Value of B" + b);

	}

	public constructorOverLoadingExample(int x, int y, int z) {
		this(10,20);
		// constructorOverLoadingExample();
		System.out.println("Third Constructor");
		a = x;
		b = y;
		c = z;

	}

	public void display() {
		System.out.println("Value of A=" + a);
		System.out.println("Value of B=" + b);
		System.out.println("Value of C=" + c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Constrctor Overloading");
		constructorOverLoadingExample def = new constructorOverLoadingExample();
		// constructorOverLoadingExample secondCons=new
		// constructorOverLoadingExample(20,30);
		constructorOverLoadingExample parame = new constructorOverLoadingExample(
				10, 20, 30);

		// def.display();
		parame.display();
		// secondCons.display();

	}
}
