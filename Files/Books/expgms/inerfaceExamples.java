package com.expgms;


final class abccc{//final class cannot inherited by any other class
	
	public void tester(){
		
		System.out.println("final method accessing");
	}
}



interface  example{
	final int a=10;
	public void test();
	
}


class animals implements example{
	//final int a;in interface value of the variable cannot be reassigned
	//Error will come like "complier error-The blank final field a may not have been initialized"
	public void test(){
	
		System.out.println("Value of A"+a);
		System.out.println("TEsting the abstract methods");
	}
	
}
public class inerfaceExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example obj=new animals();
obj.test();
	}

}
