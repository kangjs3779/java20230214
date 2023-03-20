package ch17.review;

import java.util.*;

public class R01 {
	public static void main(String[] args) {

		int[] arr = { 3, 1, 9, 0, 2, 4, 5 };
		
		int max = Arrays.stream(arr)
				.max()
				.getAsInt();
		System.out.println(max);
		
		int sum = Arrays.stream(arr)
				.reduce((a,b) -> a + b)
				.getAsInt();
		System.out.println(sum);
		
		//고전적인 방법으로 해보기
		int sum1 = 0;
		
		for(int a : arr) {
			sum1 += a;
		}
		
		System.out.println(sum1);
	}
}

