package ch02.lecture.p02type;

public class C06Overflow {
	public static void main(String[] args) {
		int i1 = 2147483647; //표현할 수 있는 가장 큰 값
		int i2 = i1 + 1;
		
		System.out.println(i1);
		System.out.println(i2); //음수가 되어 버렸다
		//이렇게 범위가 넘어가서 음수가 되어버린 것을 overflow라고 한다
		
	}
}
