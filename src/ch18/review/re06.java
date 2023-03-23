package ch18.review;

import java.io.*;

public class re06 {
	public static void main(String[] args) {
		
		String name = "output/review4.txt";
		
		try (OutputStream a = new FileOutputStream(name);
				OutputStreamWriter b = new OutputStreamWriter(a)){
			
			b.write('a');
			b.write('가');
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
