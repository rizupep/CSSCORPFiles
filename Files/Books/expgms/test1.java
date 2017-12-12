package com.expgms;


class A{
	
	public void m1(){
		
		System.out.println("m1");
	}
}

class B extends A{
public void m2(){
		
		System.out.println("m2");
	}
	
}
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj=new B(); //left hand side class only we can access .
obj.m1();

	}

}
