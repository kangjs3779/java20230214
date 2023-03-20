package ch17.sec06.exam01;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));

		studentList.stream()
				.mapToInt(s -> s.getScore()) // s에는 new Student생성자 객체가 들어간다 한개씩 전부다
				.forEach(score -> System.out.println(score));

		studentList.stream()
				.mapToInt(Student::getScore) // s에는 new Student생성자 객체가 들어간다 한개씩 전부다
				.forEach(score -> System.out.println(score));

		// 최대 점수 구하기
		System.out.println("----------------max");
		int max = studentList.stream()
				.mapToInt(Student::getScore)
				.max()
				.getAsInt();
		System.out.println(max);

		// 최소 점수 구하기
		System.out.println("----------------min");
		int a = studentList.stream()
				.mapToInt(s -> s.getScore())
				.min()
				.getAsInt();
		System.out.println(a);

		// sum
		System.out.println("--------------------------sum");
		int sum = studentList.stream()
				.mapToInt(Student::getScore)
				.sum();
		System.out.println(sum);

		// avg
		System.out.println("----------------------------avg");
		double avg = studentList.stream()
				.mapToDouble(s -> s.getScore())
				.average()
				.getAsDouble();
		System.out.println(avg);

		// 통계
		System.out.println("-----------------------통계");
		IntSummaryStatistics summary = studentList.stream()
				.mapToInt(Student::getScore)
				.summaryStatistics();
		System.out.println("최대: " + summary.getMax());
		System.out.println("최소: " + summary.getMin());
		System.out.println("합계: " + summary.getSum());
		System.out.println("평균: " + summary.getAverage());
		
	}
}
