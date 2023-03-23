package ch18.review;

import java.io.*;

public class re01 {
	public static void main(String[] args) {
		
		
		try (OutputStream os = new FileOutputStream("output/review1.txt");
				BufferedOutputStream bs = new BufferedOutputStream(os);){
			
			//파라미터 배열타입에 배열의 일부를 넣기
			byte[] arr = {1, 2, 3, 4, 5};
			bs.write(arr);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		
		//버터아웃풋스트림 객체 생성
		//생성자 파라미터에 아웃풋스트림타입 객체를 넣음
		
	}
}
