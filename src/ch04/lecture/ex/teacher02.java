package ch04.lecture.ex;

import java.util.Scanner;

public class teacher02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력> ");
		int result = scanner.nextInt();
		for (int a = 1; a <= result; a++) {
			for(int b = 1; b <= a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
}
