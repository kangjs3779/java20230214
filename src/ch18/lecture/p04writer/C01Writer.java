package ch18.lecture.p04writer;

import java.io.*;

public class C01Writer {
	public static void main(String[] args) {
		//Writer : 문자 단위 출력 스트림
		//주요 메소드 : write
		
//		Writer wr = new Writer(); 이렇게느 못 만듦 이유는??
		
		String filename = "output/writer1.txt";
		try (Writer wr = new FileWriter(filename)) {
			//write
//			wr.write(30974); //왜하필 int이냐?? 작은따옴표 안에 한글자는 int로 변환이 가능하니까
			wr.write('a');
			wr.write('b');
			//2바이트 한글자당 1바이트
			wr.write('가');
			wr.write('나');
			//지금은 8바이트
			//한글 한글자가 3바이트
			//그럴 수도 있고 안그럴 수도 있다
			//파일의 형식에 따라서 다르다
			//알아야 할 건 1바이트가 아닐 수도 있다는 점이다
			//유니코드를 써도 된다
			wr.write(9850);
			//재활용 표시의 유니코드임
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
