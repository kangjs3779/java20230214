package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C07CopyMatrix {
	public static void main(String[] args) {
		//깊은 복사(deep copy)
		int[][] arr1 = {
				{5, 7, 9, 10},
				{3, 2, 1, 0}
		};
		
		int[][] arr2 = new int[arr1.length][]; //같은 길이의 배열을 만듦
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = Arrays.copyOf(arr1[i], arr1[i].length); // 원소에 배열을 넣음
		}
		
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		System.out.println(Arrays.toString(arr2[0]));
		System.out.println(Arrays.toString(arr2[1]));
		
		arr1[0][0] = 50;
		
		System.out.println(arr1[0][0]);
		System.out.println(arr2[0][0]);
	}
}
