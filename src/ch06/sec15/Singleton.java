package ch06.sec15;

public class Singleton {
	private static Singleton singleton = new Singleton();
	//이것도 field 중 하나인가??
	//field 중 하나이다
	//기본타입이 아니면 모두 참조타입이다
	//이건 class 타입이다
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
