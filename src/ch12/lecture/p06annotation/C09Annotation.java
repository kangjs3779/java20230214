package ch12.lecture.p06annotation;

public class C09Annotation {

}

class MyClass09 {
	
	@MyAnnotation09(val1="hi", val2 = {"a", "b"})
	int f1;
	@MyAnnotation09(val1="hi", val2 = {"a"})
	int f2;
	@MyAnnotation09(val1="hi", val2 = "a")//배열에 값이 하나면 중괄호 생략 가능함
	int f3;
}

@interface MyAnnotation09 {
	String val1();
	String[] val2();
	
}

