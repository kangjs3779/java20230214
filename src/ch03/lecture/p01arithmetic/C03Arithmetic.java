package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class C03Arithmetic {
	public static void main(String[] args) {
		//백준2588
		String input = """
					472
					578
					""";
		Scanner scan = new Scanner(input);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int b1 = b % 10;
		int b10 = (b % 100) / 10;
		int b100 = b / 100;
//		System.out.println(b100);
		int x = a * b1;
		int y = a * b10;
		int z = a * b100;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(x + (y * 10) + (z * 100));
		
		//선생님 코드랑 비교하기
	}
}
