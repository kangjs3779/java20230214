package ch15.exercise.check0508;

import java.util.*;

public class exam0508 {
	public static void main(String[] args) {
		List<List<Integer>> list = List.of(
				List.of(95, 86),
				List.of(83, 92, 96),
				List.of(78, 83, 93, 87, 88)
				);
		//행렬이라 생각하면 될 듯
		
		System.out.println(list.size()); //3
		System.out.println(list.get(2).size()); //5
		
		//합과 평균구하기
		int sum = 0;
		int count = 0;
		
		for(int a = 0; a < list.size(); a++) {
			for(int b = 0; b < list.get(a).size(); b++) {
				sum += list.get(a).get(b);
				count++;
			}
		}
		
		System.out.println("총 합계 : " + sum);
		
		int avg = sum / count;
		System.out.println("총 평균 : " + avg);
		
	
		
	}
}
