package com.expgms;

import java.util.ArrayList;



class Company{
public 	int id;
	public String ab;
	public Company(int eid,String eab) 
	{
		this.id=eid;
		this.ab=eab;
		
}
	
	
	
}
public class ArraysWithOutGenerics {

	public static void main(String[] args) {
	
		//ArrayList<Company> ab=new ArrayList<Company>();
		ArrayList ab=new ArrayList();
Company a1=new Company(001,"hema");
Company a2=new Company(002,"jai");
Company a3=new Company(003,"latha");
ab.add(new  Company(569, "css"));
ab.add(a1);
ab.add(a2);
ab.add(a3);

for(Object obj: ab){
	
	if(obj instanceof Company){//it helps to the object belongs to which class
	Company tpCtid=(Company)obj; //TypeCasting .If we are not using generic need to implement the typecasting.
					                                           
	System.out.println(""+tpCtid.id+"-----"+tpCtid.ab);
}
}
	}

	}


