package ch18.review;

import java.io.*;

public class re05 {
	public static void main(String[] args) {
		
		try(PrintWriter a = new PrintWriter("output/review3.txt");) {

			a.println(33); //int
			a.println(3.3); //double
			a.println("33"); //string
			a.println('3'); //char
			a.println(true); //boolean
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
