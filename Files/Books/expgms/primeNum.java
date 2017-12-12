//A prime number is a positive integer which is divisible only by 1 and itself. 
//For example: 2, 3, 5, 7, 11, 13.
//
package com.expgms;

import java.util.Scanner;

public class primeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
boolean flag=true;
System.out.println("Enter number:====");
Scanner in=new Scanner(System.in);
int num=in.nextInt();
for(int i=2;i<num;i++){
	n=num%i;
	if(n==0){
		flag=true; 
		break; 
	}else{
		
		flag=false;
	}
}
if(flag==true){
	System.out.println("not  prime number");
}else{
	
	System.out.println("Prime number");
}
	}

}
