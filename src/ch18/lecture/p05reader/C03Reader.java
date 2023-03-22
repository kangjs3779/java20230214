package ch18.lecture.p05reader;

import java.io.*;

public class C03Reader {
	public static void main(String[] args) {
		String name = "output/writer2.txt";
		
		try(var rd = new FileReader(name)) {
			
			char[] data = new char[5];
			int len = 0;
			
			while ((len = rd.read(data)) != -1) {
				System.out.println(new String(data, 0, len));
				//이렇게 쓰면 직전에 남은 요소가 추가되지 않고 깔끔하게 읽음
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
