package ch05.check;

public class check8enhancedFor {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int avg = 0;
		int i = 0;
		
		for (int[] x : array) {
			for (int y : x) {
				sum += y;
				i++;
				avg = sum / i;
			}
		}
		System.out.println(avg);
	}
}
