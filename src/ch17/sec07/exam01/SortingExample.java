package ch17.sec07.exam01;

import java.util.*;

public class SortingExample {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 30));
		studentList.add(new Student("신용권", 10));
		studentList.add(new Student("유미선", 20));

		studentList.stream()
				.sorted() //오름차순 (낮은게 제일먼저)
				.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();

		studentList.stream()
				.sorted(Comparator.reverseOrder()) //내림차순(높은게 제일먼저)
				.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
	}
}
