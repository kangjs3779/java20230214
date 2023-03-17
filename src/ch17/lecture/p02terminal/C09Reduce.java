package ch17.lecture.p02terminal;

import java.util.*;

public class C09Reduce {
	public static void main(String[] args) {
		List<Integer> list = List.of(9, 1, 2, 3, 5);
		Integer sum = list.stream()
				.reduce(/*람다식*/(a,b) -> a + b) //결과가 a에 들어가고 다음엘레멘트가 b에 들어감
				//9,1더한 걸 a에 넣고 b는 2, a+2한걸 a에 넣고 b는 3 ....
				.get();
		System.out.println(sum);
		
		Integer max = list.stream()
				.reduce(Math::max)
				.get();
		
		System.out.println(max);
		
		Integer min = list.stream()
				.reduce(Math::min)
				.get();
		
		System.out.println(min);
	}
}
