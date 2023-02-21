package ch04.lecture.p04for;

public class C02For {
	public static void main(String[] args) {
		//변수 scope
		
		int i = 0;
		while(i < 3) {
			System.out.println("while loop");
			i++;
		}
		
		for (int a = 0; a < 3; a++) {
			System.out.println("for loop");
		}
		
		System.out.println(i);
		System.out.println(j); //for문 안에서 변수가 선언 된 것임
		//그래서 코드블럭 밖에서 호출하는 것은 안된다
		//호출하고 싶다면 for문 밖에서 선언을 하면 된다
	}
}
