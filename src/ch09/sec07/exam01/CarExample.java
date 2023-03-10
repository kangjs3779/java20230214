package ch09.sec07.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.run1();
		car.run2();
		car.run3(new Tire() {
			//원래 가지고 있는 타이어의 설계도가 맘에 안들었음
			//그래서 상속과 인스턴스 생성을 한번에 해서 오버라이드 재정의함. 익명클래스
			//파라미터에는 타이어 타입의 인스턴스가 들어감
			//재정의된 롤 메소드가 있는 인스턴스의 참조값이 들어감
			//car로 가보기
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 3이 굴러갑니다");
			}
		});
	}
}
