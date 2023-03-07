package ch07.sec11;

public class Director extends Manager{
	//manager가 봉인을 풀어서 director가 상속을 받을 수 있게 되었다
	@Override
	public void work() {
		System.out.println("제품을 기획합니다");
	}
}
