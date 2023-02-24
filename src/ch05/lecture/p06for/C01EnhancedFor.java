package ch05.lecture.p06for;

public class C01EnhancedFor {
	public static void main(String[] args) {
		int[] arr1 = {5, 6, 10, 9, 1, 2};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		//코드가 너무 길어서 간결하게 만들고 싶어짐
		System.out.println("----------------------");
		//enhanced for = 향상된 for문, for each
		for (int n : arr1) {
			System.out.print(n);
		}
		System.out.println();
		String[] str = {"a","a","a","a"};
		
		for (String b : str) {
			System.out.print(b);
		}
		//배열 안에 있는 값의 타입에 따라서 변수를 지정해주면 된다
		//index가 필요없이 배열의 전체를 탐색할 수 있게 된다
		
		//index가 필요하다면 기존의 for문을 작성하고
		//index가 팔요없다면 간결한 for문을 작성하면 된다
	}
}
