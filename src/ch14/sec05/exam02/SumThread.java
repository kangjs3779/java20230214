package ch14.sec05.exam02;

public class SumThread extends Thread {
	//sumThread라는 클래스를 만들고
	//thread클래스를 상속 받았다
	//thread클래스는 runnable인터페이스를 구현한다
	//runnable은 함수형 인터페이스로 추상메소드를 하나가지고 있다
	//그래서 그것을 재정의 해줘야 한다
	
	private long sum;
	//필드선언
	
	//getter
	public long getSum() {
		return sum;
	}
	
	//setter
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		//runnable인터페이스 안에 있는 추상메소드 재정의
		
		//반복분을 넣어 주었다
		for(int i = 1; i <= 100; i++) {
			sum+=i;
		}
	}
}
