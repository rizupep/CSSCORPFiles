package com.expgms;

import java.util.Arrays;
import java.util.Scanner;

public class reverseOfGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println("enter String");
		Scanner in=new Scanner(System.in);
		String enteredString=in.next();
	//	String actualString=enteredString;
		
		//char[] reverse= new char[10];
		int lengthOfString=enteredString.length();
		System.out.println("Length"+lengthOfString);
		char[] reverse= enteredString.toCharArray();
		for(int i=reverse.length-1;i>=0;i--){
			System.out.print(reverse[i]);
		}
	}

}
