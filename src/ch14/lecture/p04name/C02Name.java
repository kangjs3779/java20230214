package ch14.lecture.p04name;

public class C02Name {
	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) {
			Thread t1 = new Thread(() -> {
				Thread t = Thread.currentThread();
				
				System.out.println(t.getName());
			});
			t1.start();
			
			//너무 동시에 실행이 되어서 순서에 상관없이 출력이 되기도 함
			//출력할 때마다 순서가 다르게 나옴
			//jvm이 숫자를 가지고 새로운 스레드에 번호를 넣어서 이름을 만듦
		}
	}
}
