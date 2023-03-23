package ch18.review;

import java.io.*;

public class re03 {
	public static void main(String[] args) {
		
		String name = "output/review2.txt";

		try (
				Writer a = new FileWriter(name);
				BufferedWriter b = new BufferedWriter(a)) {

			b.write('a'); 
			b.write('b'); 
			b.write('c'); 
			b.write('가'); 
			b.write('나'); 
			b.newLine(); //엔터를 쳐주는 메소드
			b.write('a'); 
			b.write('b');
			b.write('c'); 
			b.write('가'); 
			b.write('나'); 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
