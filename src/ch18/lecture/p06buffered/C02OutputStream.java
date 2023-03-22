package ch18.lecture.p06buffered;

import java.io.*;

public class C02OutputStream {
	public static void main(String[] args) {
		
		String name = "output/buffered1.txt";//크기는 100byte임
		try (OutputStream fis = new FileOutputStream(name);) {

			long start = System.nanoTime();
			for(int i = 0; i < 1000_000; i++) {
				fis.write(1);			
			}
			
			fis.flush();
			long end = System.nanoTime();
			System.out.println((end - start) + "ns");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//조금 더 늦는 걸 확인할 수 있다
		
	}
}
