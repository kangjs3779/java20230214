package ch02.sec11;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5; //v2는 다른 코드블럭 안에서 선언 된 것이라서 사용할 수 없음
		
	}
}
