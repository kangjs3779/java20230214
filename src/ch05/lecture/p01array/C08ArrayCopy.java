package ch05.lecture.p01array;

public class C08ArrayCopy {
	public static void main(String[] args) {
		//자바에서의 배열은 정해진 index안에서만 사용이 가능하다
		//범위를 넘어가면 안된다
		
		int[] arr2 = {10, 20, 30}; //배열 선언함 초기선언이라 new 변수명은 생략함
		int[] arr3 = new int[arr2.length]; //배열 선언함 arr2의 길이를 가진 새로운 arr3의 배열을 선언함
		
		for (int i = 0; i < arr2.length; i++) {
			arr3[i] = arr2[i];
		} //2의 원소들의 같은 자리에 3의 원소들을 같은 자리에 할당함
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println("----------");
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		//2의 원소들을 3한테 같은자리에 할당해서 둘 다 같은 자리에 같은 원소를 가짐
		arr2[0] = 100; //2의 원소를 바꿈
		System.out.println("----------");
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		//배열 자체를 복사한게 아니라 배열 안에 있는 원소를 복사한거라서
		//원본 배열의 원소값을 바꿔도 복사본 배열의 원소값은 변하지 않음
	}
}
