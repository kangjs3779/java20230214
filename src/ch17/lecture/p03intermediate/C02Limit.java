package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C02Limit {
	public static void main(String[] args) {
		// limit 중간연산 : 크기 제한
		List<String> list = List.of("java", "css", "html", "spring", "jsp");

		Stream<String> stream1 = list.stream();
		Stream<String> stream2 = stream1.limit(3); // 스트림 원소 중 3개로 제한

		long count = stream2.count();

		System.out.println(count);

		//method chaining
		long count2 = list.stream()
				.limit(3) //중간연산
				.count(); //최종연산
		System.out.println(count2);
		//왠만하면 중간연산과 최종연산은 메소드 체인닝을 해서 나타낼 것
	}
}
