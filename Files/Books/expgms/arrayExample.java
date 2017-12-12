package com.expgms;

public class arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array Concept");
		int[] mark;   //Declaration
		
		//int m[];//less readable
		int[] marks=new int[5]; //construction
		int marks1[];
		marks[0]=20; //Initialization
		int[] a={1,2,3,4,5};
		//System.out.println("*************"+a[3]);
		//System.out.println(marks[0]);
		
		
		//********************Multiples of a number
		
		int[] x={1,2,3,4,5};
		System.out.println("*********Mutiply with array");
		for(int i=0;i<x.length;){
			int ab=x[i]*2;
			System.out.println(ab);
			i++;
			
		}
		
		char  ch;
		System.out.println("**********Comparing characters in arrray***************");
		char[] charCheck={'h','e','m','a'};
		
		for(int j=0;j<charCheck.length;j++){
	      ch=charCheck[j];
	    for(char alphabet = 'a'; alphabet <= 'z';alphabet++) {
	    	if(ch==alphabet){
	    		System.out.println("Ele matched");
	    	}else{
	    		
	    		System.out.println("*********not matched");
	    	}
	    	
	    }
			
		}
		
		

	}

}
