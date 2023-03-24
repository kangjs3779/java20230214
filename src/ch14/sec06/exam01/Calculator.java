package ch14.sec06.exam01;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
	
	private void setMemory2(int memory) {
		//lock은 바통같은 거다
		//syn블럭으로 잡아놔도 같은 객체 같은 lock이 아니면 syn블럭을 안쓰는 거나 다름이 없다
		//같은 객체여야지 syn블럭의 의미가 있는 것이다
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
}
