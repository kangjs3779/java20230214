package ch05.sec03;

public class ReferenceVariableCompareExample {
	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2); //배열 안에 정보는 같을지는 몰라도
		//배열 자체는 주소를 가리키고 있으므로 서로 다른 주소를 가지고 있다
		//그래서 다른 값을 가지고 있어서 false가 나온 것이다
		
		System.out.println(arr2 == arr3);
		//같은 주소를 가리키고 있으므로 같은 값을 가지고 있다
		//그래서 true가 나옴
	}
}
