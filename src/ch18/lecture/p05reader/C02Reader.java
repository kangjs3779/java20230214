package ch18.lecture.p05reader;

import java.io.*;

public class C02Reader {
	public static void main(String[] args) {
		String name = "output/writer2.txt";
		
		try (var rd = new FileReader(name)) {
			System.out.println((char)rd.read());
			System.out.println((char)rd.read());
			System.out.println((char)rd.read());
			//가나다 읽고 그 다음부터 5글자
			
			char[] data = new char[5];
			
			rd.read(data);
			System.out.println(data);
			rd.read(data);
			System.out.println(data);
			rd.read(data);
			System.out.println(data);
			rd.read(data);
			System.out.println(data);
			rd.read(data);
			System.out.println(data);
			rd.read(data);
			System.out.println(data);
			rd.read(data);
			System.out.println(data);
			//남은 자리에 직전에 읽었던 문자가 채워져 있다
			//0으로 채워지는 것이 아니다
			//마지막을 읽을 때에는 주의해얗 ㅏㄴ다
			//남은 개수는 다읽고 남은 자리에는 직전에 읽었던 흔적이 남아있다
			//그럼 몇개를 읽었는지 어떻게 알아??
			//다음 파일
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
