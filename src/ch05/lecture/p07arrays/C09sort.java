package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C09sort {
	public static void main(String[] args) {
		//sort : 정렬
		int[] arr1 = {9, 0, 2, 3, 8, -1};
		
//		System.out.println(Arrays.toString(arr1));
		
		//정렬 오름차순 = 제일 작은 애가 맨 앞임
		Arrays.sort(arr1);
	
		System.out.println(Arrays.toString(arr1));
		//오름차순으로 정렬이 된다
		
		String[] arr2 = {"java", "hello", "html", "css"};
		
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));

		String[] arr3 = {"java", "hello", "html", "css", "Java", "Ccs"};
		System.out.println(Arrays.toString(arr3));
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		//대분자가 더 작아서 대문자가 더 먼저 나옴
		
	}
}
