package com.expgms;

import java.util.Scanner;

public class primeNumBasedonRange {

	public static void main(String args[])
    {
		
		Scanner in=new Scanner(System.in);
		int i,j,firstRange,lastRange,num;
		int result=0;
		int total=0;
		System.out.println("first limit");
		firstRange=in.nextInt();
		System.out.println("last limit");
		lastRange=in.nextInt();
	

		
		for(i=firstRange;i<=lastRange;i++){   //range
			
			for(j=2;j<i;j++){   //outer loop satisfies means operation started
				num=i%j;
				if(num==0){
					result=0;
					break;
				}else{
					result=1;   //true if it prime number;
					
				}
				
			}
			if(result==1){      
				total++;     //total prime numbers
			System.out.println(i);//print  the prime numbers
			}
			
		}
		System.out.println("total prime numbers are:"+total);
    }
}
