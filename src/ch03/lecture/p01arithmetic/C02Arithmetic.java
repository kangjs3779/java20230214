package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class C02Arithmetic {
//백준 1008
	public static void main(String[] args) {
//		String input = """
//				1 3
//				""";
		String input = """
				4 5
				""";
		
		Scanner scan = new Scanner(input);
		int A = scan.nextInt();
		int B = scan.nextInt();
		double c = (double) A / B;
		//(double) (A / B)이렇게 적으면 이미 나누고나서 정수가되어버렸음
		//값이 정수가 된것을 실수로 바꾸니까 값이 다르게 나왔던 거임
		System.out.println(c);
	}
}
