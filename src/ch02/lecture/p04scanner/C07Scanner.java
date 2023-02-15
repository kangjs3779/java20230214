package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C07Scanner {
	public static void main(String[] args) {
		//백준2525
		String input = """
				14 30
				20""";
		Scanner scanner = new Scanner(input);
		
		int currentHour = scanner.nextInt();
		int currentMin = scanner.nextInt();
		int pastMin = scanner.nextInt();
		
		currentHour = (currentHour + (currentHour + pastMin) / 60) % 24;
		currentMin = (currentMin + pastMin) % 60;
		
		System.out.println(currentHour + " " + currentMin);
		
	}
}
