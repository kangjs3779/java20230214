package ch07.sec11;

public final class Employee extends Person{
	//employee가 상속받아서 final로 선언이 되었다
	@Override
	public void work() {
		System.out.println("제품을 생산합니다");
	}
}
