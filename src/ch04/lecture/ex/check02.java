package ch04.lecture.ex;

public class check02 {
	public static void main(String[] args) {
		String grade = "B";
		
		int score1 = 0;
		switch (grade) {
		case "A":
			score1 = 100;
			break;
		case "B":
			int result = 100 - 20;
			score1 = result;
			break;
		default:
			score1 = 60;
		}
		
		//이걸 바꾸면
		
		int score2 = switch(grade) {
						case "A" -> score1 = 100;
						case "B" -> {
							int result = 100 - 20;
							score1 = result;
						}
						default -> score1 = 60;
		
		}
	}
}
