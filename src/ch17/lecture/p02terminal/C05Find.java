package ch17.lecture.p02terminal;

import java.util.*;

public class C05Find {
	public static void main(String[] args) {
		//findFirst
		//findAny
		
		//Optional<T>
		//있을 수도 있고 없을 수도 있고
		 //제네릭 타입
		//이 타입의 객체가 있을 수도 있고 없을 수도 있고
		Optional<String> o1 = Optional.of("java");
		//java라는 스트링을 품고 있는 객체
		System.out.println(o1.isPresent()); //true
		System.out.println(o1.isEmpty()); //false
		String s1 = o1.get();
		System.out.println(s1);
		String s2 = o1.orElse("default");
		System.out.println(s2);
		
		System.out.println();
		Optional<String> o2 = Optional.ofNullable(null);
		System.out.println(o2.isPresent());
		System.out.println(o2.isEmpty());
//		String s3 = o1.get();
//		System.out.println(s3);
		
		String s4 = o2.orElse("default");
		System.out.println(s4);
		
		
	}
}
