package ch06.review;

import java.util.Arrays;

public class Class02 {
	void method1(int...args) {
		System.out.println(args);
		System.out.println(Arrays.toString(args));
	}
	
	void method2(String...args ) {
		System.out.println(Arrays.toString(args));
	}
	
	void method3(int a, String...args ) {
		System.out.println(Arrays.toString(args));
	}
}
