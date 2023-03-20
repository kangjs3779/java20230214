package ch17.lecture.p03intermediate;

import java.util.*;

public class C09Map {
	public static void main(String[] args) {
		List<String> list = List.of("java", "html", "css");
		
		list.stream()
		.map(s -> "hello " + s)
		.forEach(n -> System.out.println(n));
		
		//원소가 String이면 mapping되는 타입도 String이어야 하는가??
		//아니다
		//타입이 달라도 된다
		
	}
}
