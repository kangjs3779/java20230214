package ch18.sec03.exam01;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("output/exam3.db");
			
			while(true) {
				int data = is.read();
				if(data == -1) break; //if문에서 statement가 하나이면 중괄호 생략할 수 있다
				System.out.println(data);
			}
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
	
		}
	}
}
	
