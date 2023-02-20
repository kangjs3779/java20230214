package ch04.lecture.ex;

public class check03 {
	public static void main(String[] args) {
		int sum = 0; 
		int a = 0;
		
		while(a <= 100) {
			sum += a;
			a += 3;
		}
		
		System.out.println(sum);
	}
}
