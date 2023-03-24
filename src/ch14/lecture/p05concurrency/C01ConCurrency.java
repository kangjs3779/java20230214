package ch14.lecture.p05concurrency;

public class C01ConCurrency {
	static int field = 0;
	
	
	
	public static void main(String[] args) {
		//해결책이 너무 많아서 외울 필요는 없고 문제가 있다는 사실을 알고 있는 것이 중요함
		
		Thread a = new Thread(() -> {
			for(int i = 0; i < 1000; i++) {
				field++;
			}
		}, "A thread");
		
		Thread b = new Thread(() -> {
			for(int i = 0; i < 1000; i++) {
				field++;
			}
		}, "B-thread");
		
		a.start();
		b.start();
		//거의 동시에 시작함
		
		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(field);
		//2000이 안나오기도 함
		//왜 ? 여러 쓰래드가 어떤 객체의 값 또는 상태를 변경하는 것을 주의해야 함
		//14장에서 가장 중요한것 - 여러 쓰레드가 하나의 객체 상태를 변경하려고
		//할 때 매우 주의해서 코드를 작성해야 한다.
		
		//해결책1 : 여러쓰레드가 하나의 객체 상태를 변경하는 코드를 작성하지 않는다 (이게 가장 안전한 방법임) (이건 초급)
		
	}
}

