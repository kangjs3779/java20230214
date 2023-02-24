package ch05.sec09;

import java.util.Arrays;

public class ArraycopyOf {
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = Arrays.copyOf(oldStrArray, oldStrArray.length);
		System.out.println(Arrays.toString(newStrArray));
		
		int[] x = {1, 2, 3, 4, 5};
		int[] y = Arrays.copyOf(x, x.length);
		System.out.println(Arrays.toString(y));
		x[2] = 99;
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		y[0] = 100;
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
	}
}
