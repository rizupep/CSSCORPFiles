package com.expgms;

public class diamondPyramindWithstars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k,q;

System.out.println("Diamond stars");

//Odd triangles
for(i=0;i<=4;i++){
	for(j=0;j<=(4-i);j++){
		
		System.out.print(" ");
	}
	for(k=0;k<=i;k++){
		System.out.print("*");
	}
	for(q=1;q<=i;q++){
		System.out.print("*");
	}
	System.out.println(" ");
}
//Reverse process
for(i=0;i<=4;i++){
	for(j=i;j<=4-i;j++){
		
		System.out.print(" ");
	}
	for(k=i;k<=i;k++){
		System.out.print("*");
	}
	for(q=1;q<=i;q++){
		System.out.print("*");
	}
	System.out.println(" ");
}










	}

}
