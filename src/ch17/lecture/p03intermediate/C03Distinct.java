package ch17.lecture.p03intermediate;

import java.util.*;

public class C03Distinct {
	public static void main(String[] args) {
		// distinct 중복 제거
		List<Integer> list = List.of(3, 1, 2, 0, 1, 2, 3);

		long count1 = list.stream()
			.count();
		System.out.println(count1);
		
		long count2 = list.stream()
				.distinct()
				.count();
		//중복된 것을 제거함
		System.out.println(count2);
	}
}
