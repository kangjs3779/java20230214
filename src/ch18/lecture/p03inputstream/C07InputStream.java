package ch18.lecture.p03inputstream;

import java.io.*;

public class C07InputStream {
	public static void main(String[] args) {
		String src = "output/신짱구.png";
		String des = "output/신짱구_copy4.png";
		
		try (var is = new FileInputStream(src);
				var os = new FileOutputStream(des);) {
			
			is.transferTo(os);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//이렇게 간단하게 사용 가능함
	}
}
