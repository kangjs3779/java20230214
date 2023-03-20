package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C14FlatMap {
	public static void main(String[] args) {
		// flatMap : 원래 원소를 다른 원소'들'로 매핑

		List<Integer> list = List.of(3, 4, 5);

		// map : 1 대 1
		long count1 = list.stream()
				.map(e -> e)
				.count();

		System.out.println(count1);
		// mapping을 세번해서 카운트가 3임

		// flatMap : 1 대 다(0 ~ ?)
		// 1 대 1도 된다 그럼 그냥 map이랑 유사한 기능을 하는 것임
		long count2 = list.stream()
				.flatMap(e -> Stream.of(0, 0))
				// 파라미터가 function인터페이스로 T,R제너릭임 그안에있는 apply추상메소드 파라미터는 T, 리턴값은 R
				// 이렇게 쓰면 3들어오면 두개짜리 stream으로 리턴하고 4들어오면 두개짜리 stream으로 리턴하고 5들어오면 두개까지 stream으로 리턴함
				// 2개씩 총 3개가 되는 것임
				.count();
		System.out.println(count2);
		//그래서 6개가 된다
		
	}
}
