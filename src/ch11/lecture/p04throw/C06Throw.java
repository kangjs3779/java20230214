package ch11.lecture.p04throw;

import java.io.*;

public class C06Throw {
	public static void main(String[] args) {
		
	}
	
	//우리는 다형성을 아니까
	public static void method2() throws Exception { //또는 throwable을 적어도 된다
		int a = 1;
		
		//두 예외의 상위클래스를 적어줘도 된다
		if(a == 1) {
			throw new ClassNotFoundException();
		} else {
			throw new FileNotFoundException();
		}
	}
	
	public static void method1() throws ClassNotFoundException, FileNotFoundException{
		int a = 1;
		
		if(a == 1) {
			throw new ClassNotFoundException();
			//여기에 예외가 써졌으면 위에 꼭 적어줘야 한다
		} else {
			throw new FileNotFoundException();
		}
	}
}
