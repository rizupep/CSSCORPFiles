package com.expgms;

import java.util.Scanner;

public class amstrongNum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int temp=num;  //to avoid the over ride of the variable it will compare after the calculation
		int a;
		int c=0;//local variable need to initialize;
while(num>0){
	a=num%10;
	num=num/10;
	c=c+(a*a*a);
}
if(temp==c){
	System.out.println("Amstrong number");
}else{
	
	System.out.println("Not an amstrong number");
}
	}

}

//enter num
//