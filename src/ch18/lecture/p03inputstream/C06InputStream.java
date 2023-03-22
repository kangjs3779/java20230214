package ch18.lecture.p03inputstream;

import java.io.*;

public class C06InputStream {
	public static void main(String[] args) {
		String src = "output/신짱구.png";
		String des = "output/신짱구_copy2.png";
		
//		try(var is = new FileInputStream(src);
//				var os = new FileOutputStream(des);) {
//			
//			byte[] data = new byte[1024];
//			//파일의 크기 / 배열의 크기 = 몫...나머지
//			//몫 + 1번 읽겠구나
//			
//			while (is.read(data) != -1) {
//				//읽고
//				os.write(data);//쓰고
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try(var is = new FileInputStream(src);
				var os = new FileOutputStream(des);) {
			
			byte[] data = new byte[1024];
			//파일의 크기 / 배열의 크기 = 몫...나머지
			//몫 + 1번 읽겠구나
			
			int len = 0;
			while ((len = is.read(data)) != -1) {
				//읽고
				os.write(data, 0, len);//쓰고
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("복사완료");
		//근데 원본과 복사본2의 properties를 확인하면 다르다
		//왜냐면 1024 * (몫+1)이 되버려서
		//길이 만큼만 읽고 싶다면??
		//주석 밑 코드처럼 쓰면 된다
		
	}
}
