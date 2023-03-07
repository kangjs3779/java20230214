package ch07.sec11;

public non-sealed class Manager extends Person{
	//person을 상속받았지만 봉인을 풀었음 다른 클래스가 상속받을 수 있음
	@Override
	public void work() {
		System.out.println("생산 관리를 합니다");
	}
}
