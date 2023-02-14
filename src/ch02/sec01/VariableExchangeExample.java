package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		
		//코드 작성
		
		int z = x; //z = 3
		x = y; // x = 5
		y = z; // y = 3
		//코드는 순서대로 실행 된다
		// p38에 그림이랑 잘 나와있음
		
		System.out.println(x); //5
		System.out.println(y); //3
	}

}
