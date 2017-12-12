package com.expgms;

public class fibbnocci {
	public static void main(String[] args){
		
		int first=0,second=1,third,count=10;
		System.out.println("Fibbonoci series");
		System.out.println(first+""+"\n"+second+"");
		for(int i=1;i<=count;i++){
			third=first+second; //0+1=1
			System.out.println(third+"");
			first=second;//1
			second=third;//1
		
			
			
		}
		
		
	}

}
