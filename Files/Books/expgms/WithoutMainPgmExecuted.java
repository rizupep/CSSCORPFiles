package com.expgms;

public class WithoutMainPgmExecuted {
	static {
		
		System.out.println("Executing static block without main method");
		System.out.println("static block is invoked");  
		  System.exit(0);  
	}

}
