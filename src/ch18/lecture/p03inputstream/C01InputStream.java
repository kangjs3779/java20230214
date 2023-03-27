package ch18.lecture.p03inputstream;

import java.io.*;

public class C01InputStream {
	public static void main(String[] args) {
		//InputStream
		//byte 단위 입력 스트림
		//주요 메소드 : read
		
		////autoclosable이라는 클래스인가 인터페이스가 있음
		
		String name = "output/exam3.db"; //3바이트 크기 파일
		try (InputStream is = new FileInputStream(name)) {
			//API에서 생성자목록을 보면 된다
			
			//read : 한 바이트 읽기
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			//3바이트의 크기라서 세번 읽을 수 있음

			System.out.println(is.read());// -1
			System.out.println(is.read());// -1
			//네번째를 읽으면 어떻게 될까??
			//문제없이 실행이 된다
			//어떤 일이 일어났는가??
			//API를 보면 된다
			//read메소드 가서 보면 끝에 도달하면 -1을 리턴한다
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}
