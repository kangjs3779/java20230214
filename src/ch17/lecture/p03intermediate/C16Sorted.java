package ch17.lecture.p03intermediate;

import java.util.*;

public class C16Sorted {
	public static void main(String[] args) {
		// sorted : 정렬된 stream return
		// stream타입의 메소드라면 높은 확률로 중간연산자이다
		// 자동 정렬해준다
		List<String> list = List.of(
				"chisoo",
				"backho",
				"taewoong",
				"taesup",
				"daeman");

		list.stream()
				.sorted()
				.forEach(System.out::println);
	}
}
