package com.expgms;

import java.util.ArrayList;

class Emp{
	
	public 	int id;
	public String ab;
	public Emp(int eid,String eab) 
	{
		this.id=eid;
		this.ab=eab;
		
}
}



	class Employee{
		public String name;
		public Employee(String ename) 
		{
			this.name=ename;		
	}
		
		
	}


public class ArraysWithGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> ab=new ArrayList<Emp>();
		ArrayList<Employee> ab1=new ArrayList<Employee>();
		Emp a1=new Emp(1001,"hema");
		Emp a2=new Emp(1002,"jai");
		Emp a3=new Emp(1003,"latha");
		Employee a4=new Employee("java");
		
		ab.add(a1);
		ab.add(a2);
		ab.add(a3);
		ab1.add(a4);
		//System.out.println(ab);
		for(Emp obj: ab){
			
			System.out.println(obj.id+"---"+obj.ab);
							                                           
			
		}
		}

	}


