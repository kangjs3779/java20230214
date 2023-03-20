package ch17.lecture.p03intermediate;

import java.util.*;

public class C08Map {
	public static void main(String[] args) {
		//map : 매핑(변환)
		//어떤 요소를 다른 요소로 변화하는 것
		List<Integer> list = List.of(2,1,0,3,9);
		
		list.stream()
		.forEach(n -> System.out.println(n));

		System.out.println();
		list.stream()
		.forEach(System.out::println);
		
		//map의 파라미터는 함수형 인터페이스의 function타입의 메소드를 받는다
		//function메소드는 파라미터 타입과 리턴타입이 다름
		//T타입을 받아서 R타입으로 리턴을 해줌(리턴타입은 R타입임)
		System.out.println("0으로 맵핑");
		list.stream()
		.map(s -> 0)
		.forEach(n -> System.out.println(n));
		
		System.out.println("곱하기 2해서 짝수로 맵핑");
		list.stream()
		.map(s -> (s * 2))
		.forEach(n -> System.out.println(n));
		
		
	}
}
