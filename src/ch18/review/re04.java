package ch18.review;

import java.io.*;

public class re04 {
	public static void main(String[] args) throws Exception {
		
		String name = "output/review2.txt";
		
		Reader r = new FileReader(name);
		BufferedReader br = new BufferedReader(r);

		String a1 = br.readLine();
		System.out.println(a1);
		String a2 = br.readLine();
		System.out.println(a2);
		String a3 = br.readLine();
		System.out.println(a3);
		
	}
}
