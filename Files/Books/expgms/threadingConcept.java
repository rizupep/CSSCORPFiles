package com.expgms;


class userdef extends Thread{
	
	
	public void run(){
		
		System.out.println("User defined Thread execution");
		
	}
}



public class threadingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userdef test=new userdef();
		test.start();
		System.out.println(test.getPriority());
		System.out.println(test.getName());
		System.out.println(test.getId());
		System.out.println(test.isAlive());
		System.out.println(test.isDaemon());
	}

}
