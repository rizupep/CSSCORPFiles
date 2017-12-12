package com.expgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionSortingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Predefined class sorting in arraylist using sort");
System.out.println("******************************************************");
ArrayList<String> a1=new ArrayList<String>();
a1.add("z");
a1.add("a");
a1.add("y");
System.out.println(a1);
Collections.sort(a1);
System.out.println(a1);	

System.out.println("Array to array list then sorting the objects");
String ex[]={"B","X","Y","A"};
ArrayList<String> obj=new ArrayList<String>(Arrays.asList(ex));
for(String ob:obj){
	System.out.println(ob);
	
}
System.out.println("After sorting(Ascending order) ");
Collections.sort(obj);
System.out.println(obj);
System.out.println("After sorting(Descending order) ");
Collections.sort(obj,Collections.reverseOrder());
System.out.println(obj);
		
	}

}
