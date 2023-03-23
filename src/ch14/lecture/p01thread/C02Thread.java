package ch14.lecture.p01thread;

public class C02Thread {
	public static void main(String[] args) {
		
		Process01 p1 = new Process01();
		
		Thread t1 = new Thread(p1);
		
		t1.start();
		
		//쓰레드에 스타트메소드를 실행하면
		//저절한 순간에 쓰레드가 run메소드가 실행된다
	}
}

class Process01 implements Runnable {
	@Override
	public void run() {
		System.out.println("업무 진행");
	}
}
