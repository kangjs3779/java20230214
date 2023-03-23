package ch14.lecture.p01thread;

public class C07Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				while(true) {
					System.out.println("---작업 스레드");
				}
			}
			
		};
		
		t1.start();
		
		while (true) {
			System.out.println("--------짠");
		}
		
		//스레드를 상속해서 실행 시키는 것
	}
}
