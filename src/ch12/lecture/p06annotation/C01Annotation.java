package ch12.lecture.p06annotation;

public class C01Annotation {
	public static void main(String[] args) {
		//코멘트같은 것이다
		//이 어노테이션을 보고 어디선가 무슨 일을 한다
		//어디선가가 어디냐???
		//컴파일 할 때, 실행할 때, 다른 프로그램에서 확인한다던가
		//어노테이션을 보고 일을 한다
		//spring에서 많이 쓰인다
		//이미 만들어진 어노테이션이 있다
		//이 어노테이션을 보고 활용해서 어떤 일을 한다
		
	}
}

@MyAnnotation01
class MyClass {
	@MyAnnotation01
	String field;

	@MyAnnotation01
	public MyClass() {
	}
	
	@MyAnnotation01
	void method1() {
		
		@MyAnnotation01
		int localvar;
	}
	
	void method2(@MyAnnotation01 int param) {
		
	}
	
	
}

@interface MyAnnotation01 {
	
}
