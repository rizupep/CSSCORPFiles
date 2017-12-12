package com.expgms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filecomparison {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader first = null;
		BufferedReader secondFile = null;
		String sCurrentLine, secondreadFile;

		// BufferedReader to read a text from file[For char input stream]
		// readLine -method read a line of text

		try {

			String text1 = null, text2 = null;
			String newText = null;
			first = new BufferedReader(new FileReader(
					"D:\\testFiles\\file1.txt"));
			secondFile = new BufferedReader(new FileReader(
					"D:\\testFiles\\file2.txt"));

			while ((sCurrentLine = first.readLine()) != null) {
				text1 = sCurrentLine;
				System.out.println(text1);
			}
			while ((secondreadFile = secondFile.readLine()) != null) {
				text2 = secondreadFile;
				System.out.println(text2);
			}

			if (text1.equals(text2)) {
				newText = text2;
				System.out.println(newText);
				// FileWriter fw = new FileWriter("D:\\testFiles\\newFile.txt");
				// BufferedWriter bw = new BufferedWriter(fw);
				BufferedWriter bw = new BufferedWriter(new FileWriter(
						"D:\\testFiles\\newFile.txt"));

				bw.write(newText);

				bw.close();
				System.out.println("Done");

			} else {

				System.out.println("File not matched");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
