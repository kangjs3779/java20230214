package ch18.lecture.p07print;

import java.io.*;

public class C01PrintWriter {
	public static void main(String[] args) {
		//적절한 출력을 위한 클래스
		//이런것도 있음
		//그 네개 범위안에 있는 것임 어차피
		
		String name = "output/print1.txt";
		
		try (PrintWriter pw = new PrintWriter(name)) {
			pw.println(33333);
			pw.println(333.33);
			pw.println(true);
			pw.println("hello world");
			pw.println("슬램덩크");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
