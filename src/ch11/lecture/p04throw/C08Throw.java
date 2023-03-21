package ch11.lecture.p04throw;

import java.io.*;

public class C08Throw {
	public static void main(String[] args) {
		//1. catch 블럭을 두개 쓰거나
		try {
			method1();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//2. 이 두새의 상위클래스를 쓰거나
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//3. |로 연결하거나
		try {
			method1();
		} catch (FileNotFoundException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void method1() throws FileNotFoundException, ClassNotFoundException {
		//어디선가 이 메소드를 실행을 하면
		//catch블럭을 두개를 쓰거나
		//이 두개의 상위클래스를 쓰거나
		// |로 연결을 하거나
	}
}
