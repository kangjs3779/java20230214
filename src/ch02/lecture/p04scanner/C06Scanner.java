package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C06Scanner {
	public static void main(String[] args) {
		//백준2525
		String input = """
				14 30
				20""";
		
		Scanner scanner = new Scanner(input);
//		Scanner scanner - new Scanner(System.in);
		
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		
		Scanner line1Scanner = new Scanner(line1);
		Scanner line2Scanner = new Scanner(line2);
		
		int currentHour = line1Scanner.nextInt(); //14
		int currentMin = line1Scanner.nextInt();  //30
									//scanner변수를 읽어주는 애임(sysout이랑 비슷한 역할인데
									//얘는 스캐너를 읽어주는 역할을 한다
									//한줄한줄을 읽는 애임
		int pastMin = line2Scanner.nextInt();    //20
		
		currentHour = (currentHour + (currentMin + pastMin) / 60) % 24;
		currentMin = (currentMin + pastMin) % 60;
		
		System.out.println(currentHour + " " + currentMin);
	}
}

// 스캐너는 인풋을 토큰으로 쪼갠다 기본 구분자를 통해서
//기본 구분자 white space
// 우리가 알고 있는 스페이스 엔터 탭 이것들이 토큰의 구분자이다



