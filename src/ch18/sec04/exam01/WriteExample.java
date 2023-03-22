package ch18.sec04.exam01;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("output/test.txt");
			//문자 출력하는 객체를 만듦
			
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			//문자 하나씩 넣음
			//이 프로그램을 기준으로 여기서 적어서 파일에 넣는거니까 출력스트림이 된다
			
			char[] arr = {'C', 'D', 'E' };
			writer.write(arr);
			//배열도 넣음
			
			writer.write("FGH");
			//문자 세개 넣음
			
			writer.flush();
			//모든 데이터를 목적지에 잘 갈 수 있도록 뿌려줌
			writer.close();
			//스트림 닫음
		} catch (IOException e) {
			e.printStackTrace();
			//예외 잡아줌
		}
	}
}
