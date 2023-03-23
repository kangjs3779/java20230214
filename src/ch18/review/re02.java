package ch18.review;

import java.io.*;

public class re02 {
	public static void main(String[] args) {
		
		String name = "output/review1.txt";

		try (
				InputStream is = new FileInputStream(name);
				BufferedInputStream bs = new BufferedInputStream(is);) {
			
			while(true) {
				int a = bs.read();
				if(a == -1) break;
				System.out.println(a);
			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
