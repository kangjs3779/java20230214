package ch11.lecture.p04throw;

import java.io.*;

public class C13Throw {
	public static void main(String[] args) throws Exception {
		method2();
		//무조건 throws Exception 이걸 적는 경우가 있다
		//그렇게 좋은 코드는 아니다
		//중요하진 않지만 그래도 알아 둘 것
		
	}
	
	public static void method2() throws Exception {
		method1();
	}
	
	public static void method1() throws Exception {
		new FileInputStream("");
	}
}
