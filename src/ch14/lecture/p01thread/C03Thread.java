package ch14.lecture.p01thread;

public class C03Thread {
	public static void main(String[] args) {
		Process03 p1 = new Process03();
		Thread t1 = new Thread(p1);
		t1.start();
		
		while (true) {
			System.out.println("@@@@@@@@main thred");
		}
		//동시에 실행이 된다
	}
}

class Process03 implements Runnable {
	@Override
	public void run() {
		while(true) {
			System.out.println("##### 쓰레드 실행 중####");
		}
	}
}
