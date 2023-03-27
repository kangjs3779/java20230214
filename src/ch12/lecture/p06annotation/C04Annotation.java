package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C04Annotation {
	public static void main(String[] args) {
		Class c1 = MyAnnotation04.class;
		Annotation[] annotations = c1.getAnnotations();
		System.out.println(annotations.length);
		System.out.println(annotations[0]);
		
		System.out.println(c1.getDeclaredFields()[0].getAnnotations()[0]);
		System.out.println(c1.getDeclaredConstructors()[0].getAnnotations()[0]);
		
	}
}

@MyAnnotation04 //클래스에만 가능하고 필드나 생성자에만 가능하다
class MyClass04 {
	
	@MyAnnotation04
	String field;
}


@Target({ElementType.TYPE, ElementType.FIELD}) //여러개를 쓰고 싶으면 배열{}로 적어주면 된다
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation04 {
	
}
