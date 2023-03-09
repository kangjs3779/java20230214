package ch12.lecture.p02wrapper;

public class C04Boxing {
	public static void main(String[] args) {
		int i1 = 30000;
		int i2 = 30000;
		
		System.out.println(i1 == i2);
		
		Integer o1 = i1;
		Integer o2 = i2;
		
		System.out.println(o1 == o2);
		//참조값을 저장하는 거라서 값이 같아보여도 false 서로다른 객체 서로다른 인스턴스임
		//이렇게 쓰지마라
		
		System.out.println(o1.equals(o2));
		//같은지 비교하려면 이렇게 써라
		//이렇게 쓰면 안에 있는 값(필드값)을 비교하는 것이다
		//위에는 기본타입써도되는데 참조타입이라면 이퀄즈 써라
		
	}
}
