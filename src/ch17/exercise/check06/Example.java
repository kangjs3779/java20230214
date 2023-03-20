package ch17.exercise.check06;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("감자바", 26));

		// 고전적인 방법의 평균 나이 구하기
		int sum = 0;

		for (int a = 0; a < list.size(); a++) {
			sum += list.get(a).getAge();
		}

		double avg = (sum / list.size());
		System.out.println(avg);
		
		//향상된 for문
		double sum1 = 0;
		for(Member a : list) {
			sum1 += a.getAge();
		}
		
		double avg2 = sum1 / list.size();
		System.out.println(avg2);

		// stream을 이용한 평균 나이 구하기
		double avg1 = list.stream()
				.mapToInt(n -> n.getAge())
//				.map(Member::getAge)
				.average()
				.getAsDouble();
		System.out.println(avg1);
	}
}
