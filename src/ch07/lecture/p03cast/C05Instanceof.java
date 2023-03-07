package ch07.lecture.p03cast;

public class C05Instanceof {
	public static void main(String[] args) {
		method1(new Sub05()); //자동형변환
		//실제 인스턴스가 중요하다
		//참조변수가 가리키고 있는 인스턴스의 타입이 무엇인가를 물어보고 판단하면 된다
		//변수 안에 실제로 들어있는 인스턴스의 타입을 잘 판단해서 생각해야 한다
		
	}
	
	public static void method1(Super05 s) {
		System.out.println(s instanceof Super05); //t
		System.out.println(s instanceof Sub05); //t
	}
}


class Super05 {}
class Sub05 extends Super05 {}
