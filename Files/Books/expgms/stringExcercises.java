package com.expgms;

public class stringExcercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//concatenation(concat,+)
		String s="Sachin";  
		   s.concat(" Tendulkar");//concat() method appends the string at the end  
		   System.out.println(s);//will print Sachin because strings are immutable objects  
//Comparison(by equals,==,compareTo)
		   //equals and == return boolean value true or false
		   //But comapareTo returns integer value .
		   //s1 > s2 => positive number  (position of the character)
		  // s1 < s2 => negative number  
				  // s1 == s2 => 0  it will work based on the string character levels .equal means 0.greater means positive.less means negative
		   String s1,s2;
		   s1="Hema";
		   s2="Hemai";
		  String s5="hemalatha";
		  String stringTrim="    hema";
		   boolean s3=s1.equals(s2);   //equals
		   System.out.println(s3);
		   s3=s1.equalsIgnoreCase(s2);//equalsIgnoreCase
		   System.out.println(s3);
		   s3=s1==s2;
		   System.out.println(s3);
		   int s4="hai".compareTo("hai");//compareTo
		   System.out.println(s4);
		   String tooo=s.toLowerCase();//toLowerCase
		   System.out.println(tooo);
		System.out.println("Sub string example----"+s1.substring(1));
			System.out.println("Trim example---"+stringTrim.trim());
		 System.out.println("hashcode  of the string-----"+s1.hashCode());
			System.out.println("length of the string----"+s1.length());
			System.out.println("Character at the particular index ----"+s1.charAt(2));
System.out.println(s1.intern());
System.out.println(s1.isEmpty());
		   
		   
		   
	}

}
