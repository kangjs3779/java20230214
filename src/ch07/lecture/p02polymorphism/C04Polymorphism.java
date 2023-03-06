package ch07.lecture.p02polymorphism;

import java.util.Scanner;

public class C04Polymorphism {
	public static void main(String[] args) {
		String s1 = "java";
		Scanner sc1 = new Scanner("");
		
		method1(s1);
		method1(sc1);
		//String과 Scanner는 Object를 부모클래스로 상속받고 있다
	}
	
	public static void method1(Object o) {
		o.charAt(0);
		o.nextLine();
		
		String s = o.toString();
		//오브젝트에는 스트링이 자식클래스로 되어있기 때문에 보장되어 있다
		//오브젝트 = 동물 스트링 = 말 스캐너 = 물고기
		//
	}
}
