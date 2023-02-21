package ch04.lecture.p04for;

public class C04For {
	public static void main(String[] args) {
		//중첩된 for
		//구구단 만들기
		int res;
		for(int a=2; a < 10; a++) {
			System.out.println(a + "단");
			for(int b = 1; b <10; b++) {
				res = a * b;
				System.out.println(a + " X " + b + " = " + res);
			}
		}
	}
}
