package com.expgms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


class StudentEx{
	String a;
	public StudentEx(String stuName) {
		this.a=stuName;
		System.out.println("Accessing student class");
	}
	
}
class EmployeeEx{
	int id;
	String name;
	public EmployeeEx(int eid,String ename) {
	this.id=eid;
	this.name=ename;
	}
	
}
public class ListIteratorWithClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee class
		EmployeeEx obj=new EmployeeEx(10,"hema");
		EmployeeEx obj1=new EmployeeEx(11,"hema1");
		EmployeeEx obj2=new EmployeeEx(12,"hema2");
		
		List<EmployeeEx> a1=new ArrayList<EmployeeEx>();
		
		a1.add(obj);
		a1.add(obj1);
		a1.add(obj2);
	a1.remove(obj);//to remove the object
		ListIterator<EmployeeEx> itr=a1.listIterator();
		while(itr.hasNext()){
			EmployeeEx abc=itr.next();
			//EmployeeEx abcd=itr.
					System.out.println(	abc.id+abc.name);
		
		}
		//has previous
		while(itr.hasPrevious()){
			EmployeeEx abc=itr.previous();
			System.out.println(abc.id+"----"+abc.name);
			
		}
		//Student class
		StudentEx stuObj=new StudentEx("john");
		StudentEx stuObj1=new StudentEx("john1");
		ArrayList<StudentEx> a2=new ArrayList<StudentEx>();
		a2.add(stuObj);
		a2.add(stuObj1);
		ListIterator<StudentEx> stuLtrObj=a2.listIterator();
		while (stuLtrObj.hasNext()){
			StudentEx aqw =stuLtrObj.next();
			System.out.println(aqw.a);
		}
		
	
	}

}
