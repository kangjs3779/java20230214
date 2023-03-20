package ch17.sec06.exam03;

import java.util.*;

public class FlatMappingExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("i am best developer");
		list1.stream()
				.flatMap(data -> Arrays.stream(data.split(" ")))
				.forEach(word -> System.out.println(word));

		System.out.println();

		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
		list2.stream()
				.flatMapToInt(data -> {
					String[] strArr = data.split(",");
					int[] intArr = new int[strArr.length];
					for (int i = 0; i < strArr.length; i++) {
						intArr[i] = Integer.parseInt(strArr[i].trim());
					}
					return Arrays.stream(intArr);
				})
				.forEach(number -> System.out.println(number));

		// 우리가 아는 방법
		list2.stream()
				.flatMap(s -> Arrays.stream(s.split(",")))
				.map(s -> s.trim())
				.mapToInt(Integer::parseInt)
				.forEach(System.out::println);

		System.out.println();

		list2.stream()
				.flatMap(s -> Arrays.stream(s.split("\\s*, \\s*")))
				.mapToInt(Integer::parseInt)
				.forEach(System.out::println);

	}
}
