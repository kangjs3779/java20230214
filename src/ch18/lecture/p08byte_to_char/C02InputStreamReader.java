package ch18.lecture.p08byte_to_char;

import java.io.*;

public class C02InputStreamReader {
	public static void main(String[] args) throws Exception {
		String name = "output/byte1.txt";
		
		InputStream is = new FileInputStream(name);
		InputStreamReader isr = new InputStreamReader(is);
		
		int f1 = is.read();
		
		System.out.println((char) f1);
		
		is.close();
	}
}
