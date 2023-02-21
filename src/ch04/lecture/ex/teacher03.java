package ch04.lecture.ex;

import java.util.Scanner;

public class teacher03 {
	public static void main(String[] args) {
//		0
//		10
//		210
//		3210
//		43210
		
		Scanner user = new Scanner(System.in);
		System.out.print("입력>");
		int result = user.nextInt();
		
		for (int a = 0; a < result; a++) {
			for(int b = a; b >= 0; b--) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
}
