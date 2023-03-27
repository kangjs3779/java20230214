package ch18.review;

import java.io.FileWriter;

public class R05 {
	public static void main(String[] args) {
		
		try (var so = new FileWriter("reoutput/test2.txt")) {
			so.write('가');
			so.write('나');
			so.write('다');
			so.write('라');
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
