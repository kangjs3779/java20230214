package ch17.lecture.p03intermediate;

import java.util.*;

public class C06Peek {
	public static void main(String[] args) {
		(new Random()).ints(5)
				.peek(System.out::println)
				.forEach(System.out::println);
		
		//순서대로 하는게 아니라 peek와 foreach가 한꺼번에 일을 한다
		//중간에 일이 잘 처리가 되고 있는지 확인을 하고 싶다면
		//버그를 잡는 용도로 하고 싶을 때 사용하는 메소드가 바로 peek이다
	}
}
