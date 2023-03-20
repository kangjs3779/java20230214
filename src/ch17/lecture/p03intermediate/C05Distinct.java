package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C05Distinct {
	public static void main(String[] args) {
		// 1~45개 중 6개 랜덤
//		Stream<Integer> stream = Stream.generate(() -> 3); //3을 계속 생성해내는 메소드
		Stream<Integer> stream = Stream.generate(() -> (int) (Math.random() * 45) + 1); 

		stream
				.distinct()
				.limit(6)
				.forEach(System.out::println);
		// foreach할 때 한꺼번에 일어나서 효율적이다
		// random이라는 class가 있음

		// random class사용
		
		System.out.println("랜덤 클래스 사용 ----------------------");
		Random random = new Random();

		Stream.generate(() -> random.nextInt(45) + 1)
				.distinct()
				.limit(6)
				.forEach(System.out::println);

	}
}
