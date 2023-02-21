package ch04.lecture.p04for;

public class C03For {
	public static void main(String[] args) {
		for(int i = 0, j = 10; i < 5; i++, j--) {
			//초기식을 여러개를 쓸 수 있다
			//갯수에 맞춰서 쓸 필요 없다
			//내 마음대로 쓰면 된다
			System.out.printf("%d, %d%n", i, j);
		}
		
		//실수 연산은 하지마라 근삿값으로 계산이 되기 때문에 결과값이 정확하지 않다
		
	}
}
