package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
											//예외는 잡거나 떠넘기거나, 여기서는 떠넘김
	public static void main(String[] args) throws Exception{
		String originalFileName = "output/신짱구.png";
		String targetFileName = "output/신짱구_copy3.png";
		
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		byte[] data = new byte[1024];
		while(true) {
			int num = is.read(data);
			if(num == -1) break;
			os.write(data, 0, num);
		}
		
		os.flush();
		os.close();
		is.close();
		
		System.out.println("복사가 잘 되었습니다");
	}
}
