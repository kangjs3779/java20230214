package ch18.review;

import java.io.*;

public class R01 {
	public static void main(String[] args) {
		
		OutputStream os = null;
		try {
			os = new FileOutputStream("output/putput.txt");
			os.write(1);
			os.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if(os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
