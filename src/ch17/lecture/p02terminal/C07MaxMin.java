package ch17.lecture.p02terminal;

import java.util.*;

public class C07MaxMin {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 4, 1, 2, 10, 20);

		Integer max = list.stream()
				.max((x, y) -> x - y) // optional을 리턴값으로 받음, comparator를 파라미터로 받음  (x, y) -> Integer.compare(x,y)
				.get(); //optional에 있는 메소드

		System.out.println(max);
		
		Integer min = list.stream()
//				.min(Integer::compareTo)
				.min((Integer x, Integer y) -> x.compareTo(y)) //풀어서 쓰면 이거
				.get();
		System.out.println(min);
	}
}
