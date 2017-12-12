package com.expgms;

import java.util.Scanner;

public class PalindromeForNumber {

	public static void main(String[] args) {
	System.out.println("Palindrome for Number");
	Scanner in=new Scanner(System.in);
	int num=232;
	int reverse=0;
	while(num!=0){
	int remainder=num%10;
		reverse=reverse*10+remainder;
		num=num/10;
	}
	if(num==reverse){
		System.out.println("Palindrome");
	}else{
		System.out.println("Not a palindrome");
	}

	}

}



/*
 * 
 *
 *432  
 while(n!=0){
 remainder=n%10;
 rev=rev*10+remainder;
 n=n/10;
 
 
 }
 */
