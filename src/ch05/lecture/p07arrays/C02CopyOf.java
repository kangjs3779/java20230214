package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C02CopyOf {
	public static void main(String[] args) {
		int[] arr1 = {9, 8, 1, 2, 3};
		//int[] arr2 = arr1;
		//이건 그냥 참조값만 복사하는 거다
		//새로운 instance를 생성해서 복사하고 싶다
		int[] arr2 = new int[arr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		//선생님 코드 복사하기
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		arr1[0] = 99;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
	}
}
