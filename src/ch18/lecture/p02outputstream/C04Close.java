package ch18.lecture.p02outputstream;

import java.io.*;

public class C04Close {
	public static void main(String[] args) {
		//try - with - resources에 사용되는 코드가 복잡할 경우
		//try 밖으로 뺄 수 있음
//		try(OutputStream os = new FileOutputStream("");
//				OutputStream os2 = new FileOutputStream("");
//				OutputStream os3 = new FileOutputStream("")) {
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		
		OutputStream os = new FileOutputStream("");
		OutputStream os2 = new FileOutputStream("");
		OutputStream os3 = new FileOutputStream("");
		
		try (os; os2; os3) {
		//객체명과 ;을 이용해서 쓴다
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
