package ch17.exercise.check07;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));

		// 고전적인 방법
		List<Member> developers1 = new ArrayList<>();

		for (Member member : list) {
			if (member.getJob().equals("개발자")) {
				developers1.add(member);
			}
		}

		for (Member member : developers1) {
			System.out.println(member.getName());
		}

		System.out.println();

		// 나
		List<Member> developers = list.stream()
				.filter(a -> a.getJob() == "개발자")
				.toList();

		developers
				.stream()
				.forEach(m -> System.out.println(m.getName()));

		System.out.println();

		// 선생님
		list.stream()
				.filter(a -> a.getJob().equals("개발자"))
				.map(n -> n.getName())
				.forEach(n -> System.out.println(n));
		
		//선생님 collect
		List<Member> dev = list.stream()
				.filter(member -> member.getJob().equals("개발자"))
				.collect(Collectors.toList());
		
		System.out.println();
		dev.stream().forEach(m -> System.out.println(m.getName()));
	}
}
