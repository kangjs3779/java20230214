package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C02Annotation {
	public static void main(String[] args) {
		Class c1 = MyClass02.class;
		Annotation[] annotations = c1.getAnnotations();
		System.out.println(annotations.length);
		
	}
}

@MyAnnotation02
class MyClass02 {
	
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation02 {
	//얼마나 유지할 지 정함
	//실행하는 동안 붙어있음
	//그럼 개수는 1이 나옴
}
