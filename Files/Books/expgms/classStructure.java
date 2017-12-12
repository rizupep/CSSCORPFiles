package com.expgms;

public class classStructure {
	String localString="LocalString"; //instance variable
	static int a=5;//static variable
	
	
	static { //1
		
		System.out.println("Static block");
	}
	{
		System.out.println("Instance block--->"+a);
	}
	 public classStructure(){//2
		 System.out.println("default constructor");
		}
	 
	 public  classStructure(int x){//3
		
		 System.out.println("paramerized  constructor------>"+x);
		}
	 public void display(){ //4
		 int ab=1123;
		 System.out.println("local variables-->"+ab);
	//	 System.out.println("Instance method"+localString);
	 }
	 public static void staticMethod(){
		 System.out.println("Static method--->");
	 }
	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	classStructure obj=new classStructure();
	obj.display();
	System.out.println("Accessing insatnce variable------->"+obj.localString);
	System.out.println("Accessing static variable by object------->"+obj.a);
	System.out.println("Accessing static variable by class name------->"+classStructure.a);
	
		//new classStructure();
		classStructure obj1=new classStructure(10);
		classStructure obj22=new classStructure(10000);
		classStructure obj2=new classStructure(100);//while creating object instance block will execute
	
	//	new classStructure(a);
		staticMethod(); //no need to create instance object for the class
	}

}


/*Static block executed first*/
