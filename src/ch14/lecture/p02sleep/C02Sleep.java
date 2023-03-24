package ch14.lecture.p02sleep;

public class C02Sleep {
	public static void main(String[] args) {
		
		System.out.println("main thread start");
		
		Thread t = new Thread(() -> {
			System.out.println("thread start");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("thread end");
			//sleep메소드 때문에 2초 뒤에 시작
			//현재 진행하고 있는 메소드를 잠깐 멈출 때 사용한다
		});
		
		t.start(); 
		//여기서부터 동시에 메인스레드랑 진행
		
		System.out.println("main thread end");
	}
}
