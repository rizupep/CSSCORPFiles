package com.expgms;

import java.util.StringTokenizer;

public class StringSplit {
	
	public static void main(String args[]){
		
		String s = "welcome@java$world#temp.hema  test";
	    String delimetre = "@$#. ";
		StringTokenizer str = new StringTokenizer(s,delimetre);
		while(str.hasMoreTokens()){
			
			System.out.print(str.nextToken());
			
		}
		
		String a="Pages 10 of 100";
		String b="of ";
		String[] c=a.split(b);
		
		System.out.println("text"+c);
		
	}
}
