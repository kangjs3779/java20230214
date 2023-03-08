package ch12.lecture.p01object;

public class C11Enum {
	public static void main(String[] args) {
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.FALL);
		System.out.println(Season.WINTER);
		
		Season s1 = Season.SPRING;
		Season s2 = Season.SUMMER;
		Season s3 = Season.FALL;
		Season s4 = Season.WINTER;
		//순서를 알고 싶을 때
		System.out.println(s1.ordinal());
		System.out.println(s2.ordinal());
		System.out.println(s3.ordinal());
		System.out.println(s4.ordinal());
		
		Season s5 = Season.valueOf("SPRING");
		Season s6 = Season.valueOf("SUMMER");
		Season s7 = Season.valueOf("FALL");
		Season s8 = Season.valueOf("WINTER");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s5));
	}
}

enum Season {
	SPRING, SUMMER, FALL, WINTER
	//값을 나열하기만 하면 고정된 값을 가지는 것으로 바로 완성된다
	
}
