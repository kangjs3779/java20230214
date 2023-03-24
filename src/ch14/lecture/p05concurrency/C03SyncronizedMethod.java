package ch14.lecture.p05concurrency;

public class C03SyncronizedMethod {
	public static void main(String[] args) {
		// 해결책 2 : 메소드 전체가 syn블럭인 것
		Box box = new Box();
		Thread a = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				box.increase();
			}
		});
		Thread b = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				box.increase();
			}
		});

		a.start();
		b.start();
		try {
			a.join();
			b.join();
		} catch (Exception e) {
		}
	}
}

class Box {
	public int item = 0;

	public synchronized void increase() {
//		synchronized (this = box객체) {
//			item++;
//		(lock을 this라고 함)
//		}
		//이렇게 블럭으로 쓰지 않고 그냥 메소드 타입으로 넣어버림
		
		
		item++;
	}
}