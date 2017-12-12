package com.expgms;

import java.util.ArrayList;
import java.util.Iterator;


class ExampleClass{
	public 	int id;
	public String  name;
	public ExampleClass(int eid,String ename) {
		// TODO Auto-generated constructor stub
		this.id=eid;
		this.name=ename;
		
	}
}

public class CollectionEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		//Normal version for each
		
ArrayList a1=new ArrayList();//no generic version
a1.add(new ExampleClass(104, "hema"));
a1.add(new ExampleClass(102, "jai"));
a1.add(new ExampleClass(103, "latha"));


System.out.println("Normal version -for each");
System.out.println("*****************************");
for(Object obj:a1){
	ExampleClass typeobj=(ExampleClass)obj;//typecasting and can perform only print operation
	System.out.println("id---"+typeobj.id+"    "+"name---"+typeobj.name);
	
}

ArrayList<ExampleClass> a2=new ArrayList<ExampleClass>();//no generic version
a2.add(new ExampleClass(101, "hema1"));
a2.add(new ExampleClass(102, "jai1"));
a2.add(new ExampleClass(103, "latha1"));


System.out.println("Generic version -for each");
System.out.println("*****************************");
for(ExampleClass obj:a2){
System.out.println("id---"+obj.id+"    "+"name---"+obj.name);

}

System.out.println("Normal version -get");
System.out.println("************************");

ExampleClass obj1=(ExampleClass)a1.get(1); //typecast and get allow only one object access at a time
System.out.println("id---"+obj1.id+"    "+"name---"+obj1.name);

System.out.println(" \n generic version -get");
System.out.println("************************");

ExampleClass obj3=a2.get(1); //typecast and get allow only one object access at a time
System.out.println("id---"+obj3.id+"    "+"name---"+obj3.name);

System.out.println("Normal version -cursor-Iterator");
System.out.println("*************************************");
Iterator itr=a1.iterator(); //normal version object
while(itr.hasNext()){
	ExampleClass obj=(ExampleClass)itr.next();
	System.out.println("id---"+obj.id+"    "+"name---"+obj.name);
}

System.out.println("Generic version -cursor-Iterator");
System.out.println("*************************************");

Iterator<ExampleClass> itr1=a2.iterator(); //normal version object
while(itr1.hasNext()){
	ExampleClass obj11=itr1.next();
	System.out.println("id---"+obj11.id+"    "+"name---"+obj11.name);
}





	}

}
