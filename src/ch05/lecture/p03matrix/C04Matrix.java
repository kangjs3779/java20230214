package ch05.lecture.p03matrix;

public class C04Matrix {
	public static void main(String[] args) {
		int[] arr1 = new int[] {2, 3, 4, 5};
		
		int[][] mat1 = new int[][] {
			new int[] {3, 4, 5, 6},
			new int[] {10, 11, 12, 13},
			new int[] { 9, 5, 3, 6}
		};
		
		int[] arr2 = {2, 3, 4, 5};
		int [][] mat2 = {
				{3, 4, 5, 6},
				{5, 6, 7, 8},
				{1, 2, 3, 4}
		}; //초기 선언에는 new int(변수명) 생략 가능
		//아이템의 길이가 꼭 같아야 하는가??
		//배열의 배열일 뿐 같을 필요는 없다
		
		int[][] mat3 = {
				{1, 2, 3, 4},
				{1, 2, 3},
				{1, 2, 3, 4, 5}
		};
		
	}
}
