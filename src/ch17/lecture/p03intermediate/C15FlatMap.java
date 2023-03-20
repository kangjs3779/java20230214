package ch17.lecture.p03intermediate;

import java.util.*;

public class C15FlatMap {
	public static void main(String[] args) {
		List<String> list = List.of(
				"hello world",
				"java program",
				"css html js");

		// 단어들의 개수를 세고 싶었음
		// 배열을 스트림으로 바꿈
		long count1 = list.stream()
				.flatMap(s -> Arrays.stream(s.split(" ")))
				.count();
		System.out.println(count1);
		

	}
}
