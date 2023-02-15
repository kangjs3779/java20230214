package ch02.lecture.p03scope;

public class C01Scope {
	public static void main(String[] args) {
		//변수의 사용범위 (scope)\
		//선언된 블럭안에서만 사용 가능
		
		int v1 = 3;
		
		if (true) {
			System.out.println(v1); //사용 가능
			
			int v2 = 5;
			
			System.out.println(v2); //선언된 코드 블럭 안에서는 언제든지 사용가능
		}
		
		System.out.println(v2); //선언된 코드 블럭 밖에서는 사용 불가
		
		//코드 블럭 밖에 있는 선언 된 변수를 안에서는 사용할 수 있지만
		//코드 블럭 안에 있는 선언 된 변수를 밖에서는 사용할 수 없다
	}
}
