package ch18.lecture.p08byte_to_char;

import java.io.*;

public class C10OutputStreamWriter {
	public static void main(String[] args) throws Exception {
		String filename = "output/byte1.txt";
		OutputStream os = getOutput(filename);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		osw.write('a'); //영어는 1바이트로 표현 가능
		osw.write('한'); //실행을 해보고 파일을 열어보면 한이라고 적혀있지 않음
		//한글은 2바이트라서 출력할 떄 1바이트만 출력하고 나머지3바이트는 무시하는데 한글은 2바이트를 차지해서
		//표시가 잘 안됨
		
		osw.write('한');
		System.out.println("end");
		
		osw.close();//스트림을 닫아줘야지 한이라는 글자가 뜬다
		//해당 변수의 스트림을 닫아주어야 한다
	}
	
	public static OutputStream getOutput(String filename) throws FileNotFoundException {
		FileOutputStream os = new FileOutputStream(filename);
		
		return os;
	}
}
