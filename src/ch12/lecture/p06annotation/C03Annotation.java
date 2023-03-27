package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C03Annotation {
	public static void main(String[] args) {
		
	}
}

@MyAnnotation03
class MyClass03 {
	
	@MyAnnotation03
	String field;

	@MyAnnotation03
	public MyClass03() {
	}
	
	@MyAnnotation03
	void method1() {
		
	}
	
	//작성하는 곳을 제한하고 싶다
	//필드에만, 생성자에만, 클래스에만, 메소드에만
}


@Target(ElementType.FIELD) //필드에만 가능
@Target(ElementType.METHOD) //메소드에만 가능
@Target(ElementType.TYPE) //클래스 또는인터페이스에만 가능
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation03 {
	
}