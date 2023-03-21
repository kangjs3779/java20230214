package ch11.lecture.p04throw;

import java.io.*;

public class C09Throw {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method1() throws Exception{
		boolean a = true;
		if (a) {
			throw new ClassNotFoundException();
		} else {
			throw new FileNotFoundException();
		}
		
		//메소드에 던져지는 것은 exception이기 때문에
		//main에서도 catch조건에는 exception이라고 명시를 해줘야한다
		
	}
}
