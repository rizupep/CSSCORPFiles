

package com.expgms;



public class calculatingcountsOfString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
String a="javaWorld123@#---#";
int characters=0,digits=0,specialChar=0;
//string,numbers,special characters
for(int i=0;i<a.length();i++){
	char temp=a.charAt(i); //to read char based on length one by one
	if(Character.isLetter(temp)){
System.out.print(temp);
		characters++;
		}else if(Character.isDigit(temp)){
			
			System.out.print(temp);
			digits++;	
		}else{	
			System.out.print(temp);
			specialChar++;
		}	
	}
System.out.println("Characters:"+characters+"\nDigits"+digits+"\nSpecialCharacters"+specialChar);
		
		
		
	}
	
	
}

	//This statement is used to match  the regular expressions
//Pattern regex = Pattern.compile("[$&+,:;=?@#|]");
//Matcher matcher = regex.matcher(a);

