package ch17.lecture.p02terminal;

import java.util.*;

public class C04Match {
	public static void main(String[] args) {
		//리턴 타입 boolean
		
		
		List<Integer> list = List.of(3,5,7,9,10);
		
		boolean r1 = list.stream().allMatch(e -> e > 0); //모두 통과하는지
		System.out.println(r1);
		
		boolean r2 = list.stream().anyMatch(e -> e < 0); //하나라도 통과하는지
		System.out.println(r2);
		
		boolean r3 = list.stream().noneMatch(e -> e < 0); //모두 통과하지 않는지ㅓ
		System.out.println(r3);
		
		
	}
}
