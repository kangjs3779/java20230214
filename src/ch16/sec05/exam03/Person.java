package ch16.sec05.exam03;

public class Person {
	public Member getMember1(Creatable1 creatable) {
		//파라미터 타입이 인터페이스 타입이다
		
		String id = "winter";
		//id라는 문자열 타입의 변수에 winter라는 값을 넣음
		
		Member member = creatable.create(id);
		//클래스member타입의 변수를 만들고 인터페이스타입으로 접근하여
		//인터페이스 안에있는 추상메소드 접근
		//이게 member class에서 재정의된다
		//생성자의 역할을 하고 있음
		//파라미터가 하나있는 생성자에 id를 널음
		
		return member;
	}
	
	public Member getMember2(Creatable2 creatable) {
		String id = "winter";
		String name = "한겨울";
		Member member = creatable.create(id, name);
		return member;
	}
}
