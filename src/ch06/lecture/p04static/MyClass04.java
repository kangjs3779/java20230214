package ch06.lecture.p04static;

public class MyClass04 {
	//static member
	
	static String name;
	
	static void hello() {
		System.out.println(name + "님 안녕하세요.");
		System.out.println("오늘은 " + now() + "입니다.");
	}
	
	static String now() {
		return "2023년 02월 28일";
	}
}
