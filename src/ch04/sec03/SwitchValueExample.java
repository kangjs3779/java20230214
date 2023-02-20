package ch04.sec03;

public class SwitchValueExample {
	public static void main(String[] args) {
		String grade = "B";
		
		//Java 11이전 문법
		int score1 = 0;
		switch(grade) {
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
		System.out.println("score1: " + score1);
		
		//java 12부터 가능
		int score2 = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			//위에있는 명령문이 여기서는 일부가 되었다
			 
			
		//java 13부터 가능
			yield result; //default가 생략되면 안된다
		}
		default -> 60;
		};
		System.out.println("score2: "+ score2);
		}
}

