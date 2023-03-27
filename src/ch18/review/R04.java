package ch18.review;

import java.io.FileInputStream;

public class R04 {
	public static void main(String[] args) {
		
		try(var is = new FileInputStream("reoutput/test1.txt")) {
			//파일을 열었다~~ 입력 클래스 객체 생성
			
		while (true) {
			byte[] arr = new byte[5];
			
			int num = is.read(arr);
			if(num == -1) break;
			System.out.println(num);
		}
			
		}catch (Exception e) {

		}
	}
}
