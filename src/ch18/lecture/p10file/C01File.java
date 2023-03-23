package ch18.lecture.p10file;

import java.io.*;

public class C01File {
	public static void main(String[] args) {
		//File : (file 또는 directory)에 관한 객체
		File file = new File("src/ch18/lecture/p10file/C01File.java");
		
		System.out.println(file.getName()); //파일이름이 뭔지
		System.out.println(file.length()); //파일의 크기가 뭔지
		System.out.println(file.exists()); //파일이 존재하는지
		System.out.println(file.isDirectory()); //디렉토리 인지
		
	}
}
