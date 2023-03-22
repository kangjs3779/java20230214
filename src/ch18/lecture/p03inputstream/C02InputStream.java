package ch18.lecture.p03inputstream;

import java.io.*;

public class C02InputStream {
	public static void main(String[] args) {
		try(var is = new FileInputStream("output/exam3.db")) {
			//read메소드는 바이트를 읽고 int로 리턴을 한다
			
			int data = 0;
			
			while((data = is.read()) != -1) {
				System.out.println(data);
			}
			
			//for문으로 작성해보기
//			for(int a = 0; a)
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
