package ch05.lecture.p01array;

public class C07Array {
	public static void main(String[] args) {
		int a = 3;
		int b;
		
		b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		a = 6;
		
		System.out.println(a);
		System.out.println(b);
		
		int[] arr1 = {5, 6, 7};
		int[] arr2;
		arr2 = arr1; //배열 자체를 복사함
		
		System.out.println("----------------------");
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		arr1[0] = 50; //배열의 원소 값을 바꿈
		
		System.out.println(arr1[0]); //바꾼값이 적용된다
		System.out.println(arr2[0]); //배열 자체를 복사한 거라서 바꾼 값이 적용된다
	}
}
