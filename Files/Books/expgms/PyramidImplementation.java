package com.expgms;

public class PyramidImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		System.out.println("Pyramid formation");
		for(i=0;i<=5;i++){
			for(int k=0;k<=i;k++){
			System.out.print("");
			}
			for( j=0;j<=i;j++){
				
			System.out.print(" * ");
		
		}
			//i=i+1;
		System.out.println();
		}
		for(i=0;i<=5;i++){
			
			for(j=i;j<=5-1;j++){
				System.out.print(" * ");
				
			}
		//	i=i-1;
			System.out.println();
		}
		
		
		
		
	}
}


