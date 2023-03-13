package ch09.sec07.exam02;

public class Home {
	//필드 선언
	private RemoteControl rc = new RemoteControl() {
		//필드 영역에 인터페이스 익명 개체 선언
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		};
		//추상 메소드 재정의
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다");
		}
		//추상 메소드 재정의
	};
	
	//메소드 선언
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	//메소드 선언
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			//메소드 안에서 인터페이스 익명 개체 선언
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다");
			}
			//재정의한 메소드를 다시 재정의
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다");
			}
		};
		rc.turnOn(); //재정의한 메소드 실행
		rc.turnOff();
	}
		
		public void use3(RemoteControl rc) {
			//파라미터에 인터페이스 타입의 변수가 들어옴
			rc.turnOn();
			rc.turnOff();
			
		}
	}

