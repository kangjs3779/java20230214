package ch05.check;

public class check08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int len = 0;
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array[x].length; y++) {
				sum += array[x][y];
				len++;
			}
		}
		System.out.println("총 합 = " + sum);
		System.out.println("총 원소의 개수 = " + len);
		
		int avg = sum / len;
		System.out.println("평균 = " + avg);
	}
}
