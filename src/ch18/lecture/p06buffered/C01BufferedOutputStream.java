package ch18.lecture.p06buffered;

import java.io.*;

public class C01BufferedOutputStream {
	public static void main(String[] args) {
		
		String name = "output/buffered1.txt";//크기는 100byte임
		try (OutputStream fis = new FileOutputStream(name);
		OutputStream os = new BufferedOutputStream(fis);) {
//		BufferedOutputStream os = new BufferedOutputStream(); 이렇게 해도 된다
			//생성자 API확인 해보기
			//생성자가 아웃풋스트림을 파라미터로 받음
			long start = System.nanoTime();
			for(int i = 0; i < 1000_000; i++) {
				os.write(1);			
			}
			
			os.flush();
			long end = System.nanoTime();
			System.out.println((end - start) + "ns");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
