package com.expgms;

public class Test {
int a=10,b=20;//instance  variable
	
public void display (int a,int b){ //local variable
	
	System.out.println("a="+this.a+"*****"+"b="+this.b);	  //
	System.out.println("passed value");
	System.out.println("a="+a+"*****"+"b="+b);	
}
	

public static void main(String[] args) {
Test t=new Test();
t.display(30,50);

		
	}

}
