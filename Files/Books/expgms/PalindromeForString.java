package com.expgms;

import java.util.Scanner;

public class PalindromeForString {

	public static void main(String[] args) {
		System.out.println("Palindrome for the string ");
		Scanner in=new Scanner(System.in);
		String givenString="DAD with ";
		String reverseString="";
	
		int stringLength=givenString.length();
		for(int i=stringLength-1;i>=0;i--){
			
			reverseString=reverseString+givenString.charAt(i);
		
			
		}
		if(givenString.equals(reverseString)){
			System.out.println("Given string is a palindrome");
		}else{
			System.out.println("Not a palindrome");
		}

	}

}
