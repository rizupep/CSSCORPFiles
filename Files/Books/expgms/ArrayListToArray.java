package com.expgms;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

	//private static final String[][] String = null;

	public static void main(String[] args) {
		
		System.out.println("Array list to array conversion");
		//********normal array List with for loop
		ArrayList<String> obj= new ArrayList<String>(); //generic data type
		//ArrayList<int> 
		obj.add("welcome");
		obj.add("java");
		//for(String ab: obj){
		//	System.out.println(ab);
	//	ArrayListToArray aa=new ArrayListToArray();
		String[] ob=new String[obj.size()];
		String a2[]=obj.toArray(ob);
		 //normal array initialization
	//	}
			for(String ans :a2){
				System.out.println(ans);
				
			
		}
System.out.println("Array to array list conversion");
	//***********************Array to Array List conversion
		String ex[]={"hema","latha","jai"};
	
			
			// ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(ex));

			ArrayList<String> ex1=new ArrayList<String>(Arrays.asList(ex));
	
		
			for(String a: ex1){
			System.out.println(a);
			}
			
		

		
		
		
			}

}
