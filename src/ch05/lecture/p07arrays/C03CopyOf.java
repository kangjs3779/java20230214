package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C03CopyOf {
	public static void main(String[] args) {
		int[] arr1 = {3, 5, 9, 2, 1};
		
		//파라미터 : 원본배열, 타켓배열 길이
		int[] arr2 = Arrays.copyOf(arr1,arr1.length);
		//원본 배열보다 긴 배열을 만들면 그 공간은 기본값으로 채워진다(깁ㄴ값 = 0)
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr1);
		System.out.println(arr2);
		
		arr1[0] = 33;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
