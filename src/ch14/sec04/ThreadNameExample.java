package ch14.sec04;

public class ThreadNameExample {
	public static void main(String[] args) {
		//메인 메소드가 실행 되는게 메인 스레드인가??
		//아니면 메인 메소드에서 스레드를 따로 만들어줘야 하는건가??
		
		Thread mainThread = Thread.currentThread();
		//스레드 객체를 만들어줌
		//현재의 스레스를 실행해서 변수안에 담았음
		
		System.out.println(mainThread.getName() + "실행");
		//스레드의 이름을 읽어서 출력함
		
		for(int i = 0; i < 3; i++) {
			//세번 반복하기로함
			
			Thread threadA = new Thread() {
				//새로운 스레드객체를 만들어줌
				//익명객체를 통해서 스레드가 구현한 runnable인터페이스의 
				//추상메소드를 재정의 해줌
				@Override
				public void run() {
					System.out.println(getName() + "실행");
					//이름을 출력하도록함
				}
			};
			
			threadA.start();
			//스레드를 실행시켜서 run호출하도록 함
		}
		
		
		Thread chatThread = new Thread() {
			//새로운 스레드를 만들었음
			//익명객체를 통해서 인터페이스 안에 있는  추상메소드를 재정의해줌
			@Override
			public void run() {
				System.out.println(getName() + "실행");
				//메소드의 이름을 출력하기로함
			}
		};
		chatThread.setName("chat - thread");
		//이름을 파라미터에 적힌 것으로 바꿔줌
		chatThread.start();
		//star메소드를 통해서 run메소드를 호출해서 실행함
	}
}
