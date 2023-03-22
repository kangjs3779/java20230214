package ch18.lecture.p02outputstream;

import java.io.*;

public class C07OutputStream {
	public static void main(String[] args) {
		try (var os = new FileOutputStream("output/output7.txt")) {
			//한 바이트 쓰기
			os.write(30);1
			//아무리 큰 수가 있어도 한바이트만 쓰고 나머지 세바이트는 버려진다
			
			//여러바이트 쓰기
			byte[] data = {3,3,3,3,3,3,3,3,3,3,3};
			os.write(data); //11바이트 씀11
			
			//배열의 일부분만 쓰기
			os.write(data, 0, 3); //3바이트 인덱스 0번부터 3개를 쓰겠다15
			os.write(data, 4, 3); //인덱스 4번부터 3개를 쓰겠다 - 3byte18
			os.write(data, 0, data.length); //다 쓰겠다29
			
			//refresh해서 property보면 29나온 것을 확인할 수 있다
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
