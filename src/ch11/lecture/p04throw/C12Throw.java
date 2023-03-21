package ch11.lecture.p04throw;

import java.io.*;

public class C12Throw {
	
	public static void main(String[] args) {
		method1();
		//던지거나 잡거나 둘 중 하나
		//
	}
	
	public static void method1() throws FileNotFoundException {
									//상위클래스를 적어도 된다(Exception)
									//단 상위클래스를 던졌으면 상위클래스를 던지거나 잡아야한다
		new FileInputStream("");
		//API를 확인해보면 이건 checked exception인 것을 알 수 있다
	}
}
