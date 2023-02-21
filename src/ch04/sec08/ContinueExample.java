package ch04.sec08;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i%2 != 0) {
				continue;
			} //홀수라면 건너뛰어라 = 출력하지마라
			System.out.println(i + " ");
		}
	}
}
