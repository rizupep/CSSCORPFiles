package com.expgms;

class classOne{
public   void classOne(){
	System.out.println("Calling 1st fucntion");
}
}
class classTwo extends  classOne{
public  classTwo(){
	super.classOne(); //invokes immediate parent class
	
	System.out.println("Calling 2st fucntion");
}
}
public class inheritanceExample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classTwo a=new classTwo();
		
		
//	classOne.function1();
	}

}


