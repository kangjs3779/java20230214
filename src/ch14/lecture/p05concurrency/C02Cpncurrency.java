package ch14.lecture.p05concurrency;

public class C02Cpncurrency {
	//synchronized 블럭(동기화 블럭)
	//intrinsic lock
	//monitor lock
	//monitor
	//lock
	
	//획득해야 하는 객체를 위 네개의 이름으로 부른다
	static int field = 0;
	
	public static void main(String[] args) {
		Object o = new Object();
		Thread a = new Thread(() -> {
			for(int i = 0; i < 1000; i++) {
				synchronized (o) {
					//이거 실행 하려면 o라는 객체를 획득 해야해!!
					//객체는 하나인데 스레드 두개가 획득해야하니까 경쟁해야 함
					//하나의 객체를 얻을 때 syn블럭을 실행할 수 있다
					//획득을 해야만이 가능하고 못하면 대기 상태임
					//다 끝나면 반납한다
					//그러면 다른 스레드가 먼저 획득을 하려고 경쟁을 하겠다
					//획득 실행 반납이 반복한다고 생각하면 된다
					field++;					
				}
				//b가 일할 때 a는 일 못하게 하려고함, a가 일을 할 때는 b는 일못하게 하려함
			}
		});
		
		Thread b = new Thread(() -> {
			for(int i = 0; i < 1000; i++) {
				synchronized (o) {
					field++;					
				}
			}
		});
		
		a.start();
		b.start();
		
		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(field);
		//그럼 안전하게 2000이 고정적으로 나온다0
	}
}
