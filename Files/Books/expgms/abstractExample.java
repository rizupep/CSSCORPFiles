//abstract is partially implemented.
//abstract class need to extend in class
//abstraction is only for class and methods not for variables.
package com.expgms;


public class abstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOne obj=new methodImplementation(); 
		//abstract class object name=new implementation class
		obj.m1();
		
	}

}

abstract class MethodOne{
	//public  int a=10;
	
	public abstract void m1();
	public abstract void m2();
}

class methodImplementation extends MethodOne{
	
	public void m1(){
		
		System.out.println("Abstract method M1");
	}
	public void m2(){
		
		System.out.println("Abstract method M2");
	}
	
	
}
