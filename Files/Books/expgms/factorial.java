package com.expgms;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	WebDriver driver= new FirefoxDriver();
		
		
		
		System.out.println("factorial of 5 numbers");
		int fact=1,i;
		for(i=1;i<=5;i++){
			 fact=fact*i;	
		}
		System.out.println(fact);
		
	}

}



