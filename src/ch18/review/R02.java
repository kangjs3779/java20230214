package ch18.review;

import java.io.FileOutputStream;

public class R02 {
	public static void main(String[] args) {
		
		try (var a = new FileOutputStream("reoutput/test1.txt")) {
			//새로운 파일 생성하는 느낌의 객체 생성
			
//			a.write(2);
//			a.write(3);
//			a.write(4);
//			a.write(5);
			
			byte[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
			a.write(arr);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
