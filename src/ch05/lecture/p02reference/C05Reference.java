package ch05.lecture.p02reference;

public class C05Reference {
	public static void main(String[] args) {
		int[] arr = {2, 4, 6};
		
		int[] arr2 = arr;
		
		System.out.println(arr2[0]); //2
		
		arr = new int[] {8, 9, 7};
		System.out.println(arr[0]); //8
		arr[0] = 20;
		System.out.println(arr[0]); //20
		
		System.out.println(arr2[0]); //2
		
	}
}
