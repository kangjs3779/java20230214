package ch06.lecture.p08static;

public class MyClass01 {
	//field
	
	//인스턴스 필드
	String name;
	
	//정적(static) 필드
	static String company;
	
	
	// 생성자 : 인스턴스 필드 초기화
	MyClass01() {
		name = "son";	
	}
	
	// static initialization block : 스태틱 필드 초기화
	// 정적 초기화 블럭
	static {
		company = "samsung";
	}
	
}
