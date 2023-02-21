package ch04.lecture.ex;

import java.util.Scanner;

public class teacher01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력>");
		int result = scanner.nextInt();
		
		for(int a = 0; a < result; a++) {
			for(int b = 0; b <= a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
}
