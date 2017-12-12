//Super keyword is used to access the immediate parent class 
//1.constructor-super();
//2.method-super.method name
//3.variable-super.variable name

package com.expgms;



class AB{
	
	public void m1(){
		
		System.out.println("Parent class access");
	}
	
	
}

class ABC extends AB{
	
	public void m2(){
		super.m1(); //accessing parent class method
		System.out.println("Child class access ");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC obj=new ABC();
		obj.m2();

	}

}
