package ch18.lecture.p02outputstream;

import java.io.*;

public class C03Close {
	public static void main(String[] args) {
		//try - with - resources
		
		try (OutputStream os = new FileOutputStream("");) {
			//자동으로 닫아주기 위해서 try옆에 객체를 만들어주기만 하면 된다
			//()자체가 class안에 있는 close메소드로 접근하겠다 라는 뜻임
			
			os.write(1);
			os.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
