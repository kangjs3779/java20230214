package ch18.review;

import java.io.FileReader;

public class R06 {
	public static void main(String[] args) {
		
		try (var si = new FileReader("reoutput/test2.txt")) {
			
			int a = si.read();
			System.out.println(a);
			
		}catch (Exception e) {

		}
	}
}
