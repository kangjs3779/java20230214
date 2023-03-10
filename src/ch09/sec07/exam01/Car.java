package ch09.sec07.exam01;

public class Car {
	
	private Tire tire1 = new Tire();
	//얘는 원래의 롤메소드
	
	private Tire tire2 = new Tire() {
		//tire1의 설계도가 맘에 안들어서 이클래스를 상속받는 클래스는 만듦
		//근데 여기서만 쓸 거라서 익명클래스로 재정의를 함
		//실제 인스턴스의 메소드가 실행 되는 것이다
		//하위클래스가 상속받으니까 하위는 상위다 가능함 - 그래서 상위타입으로 만든 변수에 값을 넣음
		//중첩 인스턴스 클래스
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다");
		}
	};
	
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire객체 2가 굴러갑니다");
			}
		};
		tire.roll();
	}
	
	public void run3(Tire tire) {
		tire.roll();
		//익명클래스로 재정의 된 롤메소드를 가리키는 인스턴스 값이 파라미터로 들어옴
		//그 인스턴스 값때문에 재정의된 메소드가 실행 된다
		//tire타입의 값이 들어와서 그 인스턴스값으로 원하는 메소드를 실행 시킴
		
	}
	
}
