package ch08.lecture.p04etc;

public interface MyInterface01 {
	void method1();
	
	//default method : interface의 구현된 메소드
	//public은 안써도된다 그냥 생략해도 됨
	//접근제한자 생략하면 public
	public default void method2() {
		System.out.println("interface default method");
		System.out.println("body가 있는 메소드");
	}
	//default method도 override 가능함
	
}
