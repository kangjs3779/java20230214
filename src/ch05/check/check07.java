package ch05.check;

public class check07 {
	public static void main(String[] args) {
		//최대값 출력하기
		int[] array = { 1, 5, 3, 8, 20};
		
		int x = 0;
		int y = 0;
		int result = 0;
		for(int a = 0; a < array.length; a++) {
			x = array[a];
			for(int b = 0; b < array.length; b++) {
				y = array[b];
				if (x > y) {
					result = x;
				} else if (x < y) {
					result = y;
				} else {
					continue;
				}
			}
		}
		
		System.out.println(result);
		
		
	}
}
