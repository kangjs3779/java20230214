package ch18.sec02.exam02;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("output/exam.db");
			//얘를 try옆에 있는 ( )안에 적으면 자동 close임
			byte[] array = {10,20,30};
			
			os.write(array);
			
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
