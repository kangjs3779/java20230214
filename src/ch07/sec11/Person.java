package ch07.sec11;

public sealed class Person permits Employee, Manager{
	//person은 봉인 되어 있고 오직 employee와 manager만 상속받을 수 있다
	public String name;
	
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다");
	}
}
