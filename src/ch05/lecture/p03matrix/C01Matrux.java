package ch05.lecture.p03matrix;

public class C01Matrux {
	public static void main(String[] args) {
		//matrix = 행렬
		//배열의 배열 = 행렬
		//배열은 1차원 행렬 2차원
		//2차원 배열 = 행렬
		int[][] arr = new int[3][];
		//arr의 길이는 3이다
		System.out.println(arr.length);
		arr[0] = new int[] {1, 3, 5, 7};
		arr[1] = new int[] {2, 4, 6, 8};
		arr[2] = new int[] {9, 10, 11, 12};
		//index는 0부터 시작한다
		//행렬의 자리를 보는 것과 같음 근데 index라서 0부터 시작함
		
		System.out.println();
		System.out.println(arr[0][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[2][3]);
		
		System.out.println("전체 탐색");
		System.out.println();
		for (int i= 0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
