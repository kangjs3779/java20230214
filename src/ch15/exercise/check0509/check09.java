package ch15.exercise.check0509;

import java.util.*;

public class check09 {
	public static void main(String[] args) {
		
		List<Integer> scores = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		String choiceList = """
				------------------------------------------------------
				1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
				------------------------------------------------------
				""";
		String choiceNum = "선택>";
		
		while (run) {
			System.out.println(choiceList);
			System.out.print(choiceNum);
			String num = scan.next();
			switch (num) {
				case "1" :
					System.out.print("학생수>");
					int size = scan.nextInt();
					scores.s
					System.out.println(scores.size());
					break;	
				case "2" :
					System.out.println("점수입력");
					break;
				case "3" :
					System.out.println("점수리스트");
					for(int a = 0; a < size; a++) {
						
					}
					break;
				case "4" :
					System.out.println("분석");
					break;
				case "5" :
					System.out.println("종료");
					run = false;
					break;
			}
		}
	}
}
