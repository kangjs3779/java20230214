package ch17.exercise.check05;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions");

		// 고전적인 방법
		for (String e : list) {
			if (e.toLowerCase().contains("java")) {
				System.out.println(e);
			}
		}

		// stream
		list.stream()
				.filter(e -> e.toLowerCase().contains("java")) //java를 포함한 애들만 걸러서 뽑아낸다
				.forEach(n -> System.out.println(n));
		
		
		//좀 더 읽기 쉬운 코드
		list.stream()
		.filter(Example::havingJava)
		.forEach(System.out::println);
	}
	
	private static boolean havingJava(String s) {
		return s.toLowerCase().contains("java");
	}
}
