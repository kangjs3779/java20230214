package ch05.lecture.p03matrix;

public class C02Matrix {
	public static void main(String[] args) {
		int[][] mat = new int[3][4];
		
		//mat라는 배열 자체의 길이는 3
		System.out.println(mat.length); //3
		
		//mat안에 있는 원소들의 길이는 4
		System.out.println(mat[1].length);
		
		System.out.println("전체 탐색");
		for(int a = 0; a < mat.length; a++) {
			for(int b = 0; b < mat[a].length; b++) {
				System.out.println(mat[a][b]);
			}
		}
	}
}
