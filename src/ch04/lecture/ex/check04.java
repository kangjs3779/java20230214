package ch04.lecture.ex;

public class check04 {
	public static void main(String[] args) {
		
		int nun1 = (int)((Math.random() * 6) + 1);
		int nun2 = (int)((Math.random() * 6) + 1);
		int sum = nun1 + nun2;
		while( sum == 5) {
			System.out.println("(" + nun1 + ", " + nun2 + ") = " + sum);
			nun1 = (int)((Math.random() * 6) + 1);
			nun2 = (int)((Math.random() * 6) + 1);
		}
	}
}
