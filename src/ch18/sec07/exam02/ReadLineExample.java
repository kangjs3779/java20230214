package ch18.sec07.exam02;

import java.io.*;

public class ReadLineExample {
	public static void main(String[] args) throws Exception {
		
		String name = "src/ch18/sec07/exam02/ReadLineExample.java";
		//이 파일을 읽어볼 것이다
		
		BufferedReader br = new BufferedReader( new FileReader(name));
		//생성자 파라미터에 reader클래스타입인데 이건 문자 입력 스트림의 최상위 클래스이다
		//문서 파일을 열었다
		//경로를 파라미터로 넣어줌
		
		int lineNo = 1;
		
		while(true) {
			String str = br.readLine();
			//한줄을 읽어서 문자타입의 변수에 넣었다
			if(str == null) break;
			//만약에 더이상 읽을 게 없어서 null이 나오면 break이다
			System.out.println(lineNo + "\t" + str);
			//라인넘버랑 탭만큼 띄고 한줄 읽은 것을 출력하겠다
			lineNo++;
			//1씩 더해주고 다시 반복!!
		}
		
		br.close();
		//스트림 닫아주기!!
		//catch문 안쓰고 예외 떠넘겨버림
	}
}
