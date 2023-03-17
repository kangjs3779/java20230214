package ch17.lecture.p02terminal;

import java.util.*;

public class C10Reduce {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "html", "jsp");
		// 문자열의 길이를 더하고 싶다면

		Integer sum = list.stream()
				.map(e -> e.length()) // Integer로 바뀜
				.reduce(Integer::sum)
				.get();
		
		System.out.println(sum);
	}
}
