package ch12.exercise.other;

public class MathMax {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int result = 0;
		
		for(int n : array) {
			result = Math.max(result, n);
		}
		
		System.out.println(result);

	}
}
