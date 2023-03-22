package ch18.lecture.p03inputstream;

import java.io.*;

public class C05InputStream {
	public static void main(String[] args) {
		//구글에서 사진을 다운받아서 output에 넣음
		String src = "output/신짱구.png";
		String des = "output/신짱구_copy.png";
		
		try (
				var is = new FileInputStream(src);
				var os = new FileOutputStream(des);) {
			int data = 0;
			while((data = is.read()) != -1) {
				os.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("복사완료");
		//그림이 복사됨
	}
}
