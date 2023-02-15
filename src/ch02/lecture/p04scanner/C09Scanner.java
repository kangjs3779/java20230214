package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C09Scanner {
	public static void main(String[] args) {
		//백준 25304번
		String input = """
				260000
				4
				20000 5
				30000 2
				10000 6
				5000 8
				""";
		Scanner scanner = new Scanner(input);
		int total = scanner.nextInt();
		int loop = scanner.nextInt();
		
		for (int i = 0; i < loop; i++) {
			int price = scanner.nextInt();
			int qty = scanner.nextInt();
			
			total -= (price * qty);
		}
		
		if (total == 0) {
			System.out.println("Yes");
		}
		
	}
}
