package com.expgms;

public class StringSplitCharDigitNum {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		boolean flag=true;
		String a="javaWorld123@#---#";
		for(int i=0;i<a.length();i++){
		char temp=a.charAt(i);
		
		if(Character.isDigit(temp)){
		char dig=temp;
		System.out.print(dig);

		}
	
		else if(Character.isLetter(temp)){
			char let=temp;
			System.out.print(let);
			
		}else if(Character.isSpaceChar(temp)){
			System.out.println(temp);
		}
		
		
		}
		
		
	}

}
