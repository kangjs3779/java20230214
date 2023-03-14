package ch15.exercise.check0507;

import java.util.*;

import ch12.exercise.other.*;

public class Max {
	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 8, 2};
		int max = 0;
		for(int a : arr) {
			System.out.println((max < a) ? max = a : max);
		}
		
		List<Integer> list1 = new ArrayList<>();
		//요소 수정 가능
		//귀찮
//		list.add(1);
//		list.add(3);
//		list.add(5);
		
		List<Integer> list2 = List.of(1, 5, 3, 8, 2);
		//요소 수정 불가능
		
		
		//최댓값 구하기
		int max1 = Integer.MIN_VALUE;
		
		for(Integer e : list2) {
			max1 = Math.max(max,  e);
		}
		System.out.println("----");
		System.out.println(max1);
		
	}
}
