package ch17.lecture.p03intermediate;

import java.util.*;

public class C07Filter {
	public static void main(String[] args) {
		// filter = 걸러내기
		List<Integer> list = List.of(3, 9, -1, 0, 2, -3, -6, 7, 8);

		//
		list.stream()
				.filter(s -> s > 0) // 파라미터가 함수형 인터페이스 - 추상메소드는 boolean타입이다 true면 살아남도 false면 탈락이다
				.forEach(System.out::println);

		System.out.println("짝수만");
		list.stream()
				.filter(s -> (s % 2) == 0)
				.forEach(System.out::println);
		
		System.out.println("홀수만");
		list.stream().filter(s -> (s % 2) != 0).forEach(System.out::println);

	}
}
