package ch12.lecture.p02wrapper;

public class C06UnBoxing {
	public static void main(String[] args) {
		int i1 = 30000;
		int i2 = 30000;
		
		Integer o1 = i1;
		Integer o2 = i2;
		
		System.out.println(o1 == o2);
		//참조타입의 비교는 이퀄즈를 써야한다
		
		int i3 = o1;
		int i4 = o2;
		
		System.out.println(i3 == i4);
		//이렇게 하면 기본타입의 비교라서 이렇게 써도된다
	}
}
