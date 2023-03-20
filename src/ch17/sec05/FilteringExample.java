package ch17.sec05;

import java.util.*;

public class FilteringExample {
	public static void main(String[] args) {
		// List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("신용권");
		list.add("감자바");
		list.add("신민철");

		list.stream() //스트림클래스를 사용하기 위해 메소드 접근
				.distinct() //중복 요소 제거
				.forEach(n -> System.out.println(n)); //반복해서 출력
		System.out.println();

		list.stream() //스트림 클래스 사용하기 위해 메소드 접근
				.filter(n -> n.startsWith("신")) //요소중에 신으로 시작하면 탈락
				.forEach(n -> System.out.println(n)); //남은 요소 반복해서 출력
		System.out.println();

		list.stream() //스트림 클래스 사용하기 위해 메소드 접근
				.distinct() //중복 걸러냄
				.filter(n -> n.startsWith("신")) //신으로 시작하면 걸러냄
				.forEach(n -> System.out.println(n)); //남은 요소들 출력함

	}
}
