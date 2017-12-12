package com.expgms;

import java.util.Scanner;

public class swappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Swapping of two numbers");
		Scanner in=new Scanner(System.in);
		System.out.println("number1");
		int number1=in.nextInt();
		System.out.println("number2");
		int number2=in.nextInt();
		int temp=number1;
		number1=number2;
		number2=temp;
		
		System.out.println(number1);
		System.out.println(number2);
	}

}
