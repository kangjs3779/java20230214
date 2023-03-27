package ch18.review;

import java.io.*;

public class R01 {
	public static void main(String[] args) throws FileNotFoundException {
		
		OutputStream os = new FileOutputStream("");
		
		try(os) {
			
			os.write(1);
			os.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
