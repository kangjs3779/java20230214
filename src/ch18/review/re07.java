package ch18.review;

import java.io.*;

public class re07 {
	public static void main(String[] args) {
		
		String name = "output/review4.txt";
		
		
		try (InputStream a = new FileInputStream(name);
				InputStreamReader b = new InputStreamReader(a)) {
			
			System.out.println((char)b.read());
			System.out.println((char)b.read());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
