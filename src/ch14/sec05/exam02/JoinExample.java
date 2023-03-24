package ch14.sec05.exam02;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		//내가 만든 클래스타입으로 변수를 만들어 객체를 만들었다
		
		sumThread.start();
		//thread클래스 안에 있는 start메소드는 runnable에 있는 run메소드를 호출한다
		
		try {
		//join메소드는 interruptedException을 던진다	
			sumThread.join();
			//join메소드는 변수의 스레드가 끝나고 나서 메인스레드가 진행이 된다
			
		} catch (Exception e) {
			//던져진 예외를 잡았다
		}
		
		System.out.println("1-100 합 : " + sumThread.getSum());
		//클래스안에있는 필드를 읽어서 출력했다
	}
}
