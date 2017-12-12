package com.expgms;

import java.util.Scanner;

public class reverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("reverse number");
		int reverse=0;
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
	int number=in.nextInt();
	while(number!=0){
		reverse=reverse*10;
		reverse=reverse+number%10;
		number=number/10;
		
		
	}
	System.out.println("REverse:"+reverse);
	}

}
