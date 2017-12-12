package com.expgms;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileREadingAndWriting {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
		
		//reading from a file
	//	BufferedReader ob=new BufferedReader(new FileReader("D//testFiles//newFile.txt"));
	//	System.out.println(ob);
		//Compare file path
		File file=new File("D:\\testFiles\\file1.txt");
		File file1=new File("D:\\testFiles\\file1.txt");
	
		System.out.println(file1);
		System.out.println(file);
		if(file.compareTo(file1)==0){
			System.out.println("File path is same");
	}
		else{
			System.out.println("File path is not same");
		}
	//create new file
		
		File fileCreation=new File("D://testFiles//fileCreation.txt");
		if(fileCreation.createNewFile()){
			System.out.println("file created");
		}else{
			
			System.out.println("already exist");
		}
		
		//write into a new file
		BufferedWriter ob=new BufferedWriter(new FileWriter("D:\\testFiles\\fileCreation.txt"));
	String stringValue="File created";
		ob.write(stringValue);
	System.out.println("data written into "+"fileCreation.txt"+" successfully");
	ob.close();
	//reading a data from the file
	@SuppressWarnings("resource")
	BufferedReader readObj=new BufferedReader(new FileReader("D:\\testFiles\\fileCreation.txt"));
	String str;
	while((str=readObj.readLine())!=null){
		System.out.println(str);
		}
	
	//absoulte path
	
	System.out.println(fileCreation.getAbsolutePath());
	System.out.println(fileCreation.getCanonicalPath());
	System.out.println(fileCreation.getPath());
	System.out.println(fileCreation.getName());
	System.out.println(fileCreation.getParent());
	
	System.out.println(fileCreation.getFreeSpace());
	System.out.println(fileCreation.getUsableSpace());
	System.out.println(fileCreation.isHidden());
	System.out.println(fileCreation.isAbsolute());
	System.out.println(fileCreation.lastModified());
	System.out.println(fileCreation.length());
//list the folders
	System.out.println("list the folders in the directory");
	File listObj=new File("D:\\testFiles");
	String[] path=listObj.list();
	for( String listobj:path){
		
		System.out.println(listobj);
	}
	
	//Getting input at run time
	
	

	}

}
