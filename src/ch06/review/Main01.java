package ch06.review;

public class Main01 {
	public static void main(String[] args) {
		Class01 a1 = new Class01();
		//new를 통해서 instance를 만들어줌
		//그리고 instance에 접근할 수 있는 참조값을 a1에 넣어줌
		//참조값을 만들어주지 않으면 쓰레기 객체임
		System.out.println("a1의 참조값 " + System.identityHashCode(a1));
		//class01에 접근할 수 있는 참조값을 출력함
		System.out.println("a1.str의 값 " + a1.str);
		//이때 str에는 아무런 값이 없음. null을 가짐
		System.out.println("a1.str의 참조값 " + System.identityHashCode(a1.str));
		//그래서 참조값을 출력하면 0이 나옴
		//왜냐하면 저장할 값이 없어서 instance를 생성하지 않았음
		//그 instance를 참조하기 위한 값이 안나옴
		
		a1.str = "java";
		//class01에 있는 str이라는 String변수에 값을 넣어줌
		//참조타입이니까 참조값이 저장되고 진짜값은 heap영역에 저장됨
		
		System.out.println("a1.str의 값 " + a1.str);
		//str안에는 참조값이 있고 그 값을 이용해서 진짜값에 접근할 수 있음
		System.out.println("a1.str의 참조값 " + System.identityHashCode(a1.str));
		//str안에 참조값이 있는지 확인하기 위해 참조값을 출력시킴
		
		System.out.println("------------");
		
		System.out.println("a1.x의 값 " + a1.x);
		//class01안에 있는 정수타입의 변수x에 아무런 값을 넣지않아서 0이 나옴(기본값)
		System.out.println("a1.x의 참조값 " + System.identityHashCode(a1.x));
		//기본타입이라 바로 저장공간이 생김, 그 저장 공간에 대한 주소값이 나옴
		
		a1.x = 5;
		//5을 넣었음
		
		System.out.println("a1.x의 값 " + a1.x);
		System.out.println("a1.x의 참조값 " + System.identityHashCode(a1.x));
		
		a1.x = 7;
		//새로운 공간에 7이 들어감
		System.out.println("a1.x의 값 " + a1.x);
		System.out.println("a1.x의 참조값 " + System.identityHashCode(a1.x));
		//5와는 다른 주소값이 나옴
		
		System.out.println("------------------");
		a1.method1();
		System.out.println(a1.method1());
		
		int x = a1.method1() + 5;
		System.out.println(x);
		
	}
}
