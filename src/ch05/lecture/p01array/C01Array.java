package ch05.lecture.p01array;

public class C01Array {
	public static void main(String[] args) {
		//array (배열) 
		//여러 값을 가진 자료형(data type)
		//값의 순서가 있음
		//0번 부터 시작된다
		
		int a; //기본 타입
		a = 3;
		
		int[] arr1; //배열 타입(각 값(원소(element), 아이템(item))의 타입이 int인 배열 타입)
		arr1 = new int[3]; //아이템의 수 정의(몇개를 넣을 지)
		
		//각 배열의 index로 그 자리에 값을 넣어줌
		arr1[0] = 3;
		arr1[1] = 5;
		arr1[2] = 10;
		
		a = arr1[0];
		System.out.println(arr1[1]);//5
		System.out.println(arr1[2]);//10
		System.out.println(a);//3
		System.out.println(arr1[0]);//3
		
		arr1[0] = 99; //0번자리에 99로 바꿔줌. a의 변수는 값이 변하지 않고 arr1의 0번 자리만 바뀌었음
		System.out.println(a); //3
		System.out.println(arr1[0]); //99
		
		//for문과 궁합이 잘 맞는 자료형
		int[] arr2;
		arr2 = new int[4];
		
		arr2[0] = 99;
		arr2[1] = 100;
		arr2[2] = 200;
		arr2[3] = 300;
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		
		//위 코드를 for문으로 만들어보기
		for (int i = 0; i < 4; i++) {
			System.out.println(arr2[i]);
		}
		//같은 결과가 나옴
	}
}
