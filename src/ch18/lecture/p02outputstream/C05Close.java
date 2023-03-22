package ch18.lecture.p02outputstream;

import java.io.*;

public class C05Close {
	public static void main(String[] args) {
		//var
		String s = "java";
		var s2 = "java";
		//들어가는 객체에 따라서 참조변수의 타입을 유추함
		
		//try - with-resources에 var 사용 가능
		try (var os = new FileOutputStream("")) {
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
