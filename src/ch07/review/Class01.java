package ch07.review;

public class Class01 {
	//field
	private static Class01 instance = new Class01(); 
	//클래스의 instance를 새롭게 만들고
	//참조값을 instance라는 변수안에 넣는다
	//클래스 타입 변수
	
	
	//constructor
	private Class01() {
		//생성자를 선언한다
		//생성자를 private 접근제한자를 사용한다
	}
	
	//method
	//클래스 타입 메소드(리턴값 필요)
	//클래스 리턴값 = 참조값 리턴 필요
	public static Class01 getInstance() {
//		System.out.println(instance);
		return instance;
	}
}


