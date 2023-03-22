package ch18.sec02.exam03;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		//try - with - resources 로 써보는 습관을 들이는 것이 좋다
		//이걸로 고쳐서 적어볼 것
		try {
			OutputStream os = new FileOutputStream("output/exam3.db");
			
			byte[] array = {10,20,30,40,50};
			
			os.write(array, 1, 3); //1번 인덱스 부터 3개를 쓰겠다
			
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
