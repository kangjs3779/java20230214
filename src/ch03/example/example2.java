package ch03.example;

public class example2 {
	public static void main(String[] args) {
		int score = 85;
		String result = (!(score > 90)? "가" : "나");
		System.out.println(result);
	}
}
