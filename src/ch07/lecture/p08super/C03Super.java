package ch07.lecture.p08super;

public class C03Super {
	
}

class Super03 {
	Super03(int i) {
		//파라미터있는 생성자를 생성하면 기본생성자는 자동삽입이 되지 않는다
	}
}
class Sub03 extends Super03 {
	Sub03() {
		super(5);
		//상위 객체의 생성자가 파라미터가 있는 생성자가 선언되었으므로
		//파라미터 개수 타입 순서에 맞게 상위 생성자 호출을 해줘야 한다
		//명시적 호출을 해주어야 한다
		
		//super(); 자동으로 삽입되는 상위클래스 기본생성자 호출 코드는 동작하지 않음
		//왜냐하면 없으니까
		
	}
}

