package ch17.lecture.p03intermediate;

import java.util.stream.*;

public class C12Map {
	public static void main(String[] args) {
		//기본타입 int가 원소 스트임
		IntStream stream1 = IntStream.range(11, 20); //20은 포함안된다
		
		//참조타입 Integer가 원소인 스트림으로 변환
		Stream<Integer> stream2 = stream1.mapToObj(Integer::valueOf);
		//어떤 타입으로든 타입 변경 가능 toobj
		long count = stream2.count();
		System.out.println(count);
		
	}
}
