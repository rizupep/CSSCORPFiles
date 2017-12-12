package com.expgms;

import java.util.Scanner;

public class sortingNumbersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sorting");
		int i,j,n,temp;
		//int a[],b[],c[];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter numbers");
		n = in.nextInt();
		System.out.println("The numbers are");
        int a[] = new int[n];
		for( i=0;i<n;i++){
		a[i]=in.nextInt();
		}

		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(a[i]<a[j]){
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				//System.out.println(a[j]);
				}
			}
			
			
		}
		
		for(i=0;i<n;i++){
			//System.out.println("Sorting the numbers");
			System.out.println(a[i]);
			
		}
	}

}
