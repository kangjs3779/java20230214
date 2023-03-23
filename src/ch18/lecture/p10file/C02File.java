package ch18.lecture.p10file;

import java.io.*;

public class C02File {
	public static void main(String[] args) {
		File file = new File("output");
		
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		//디렉토리 안에 있는 파일 목록을 좀 보고 싶다
		File[] files = file.listFiles();
		
		for(File f : files) {
			System.out.println(f.getName());
		}
	}
}
