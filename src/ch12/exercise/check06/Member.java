package ch12.exercise.check06;

public class Member {
	private String id;
	private String name;
	
	//생성자
	//재정의를 하지 않으면 참조값이 출력되는데 왜그러지?
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id + ": " + name;
	}
	//객체를 어떻게 표현을 할 것인지 정하고 싶으면 사용할 수 있음
	//필요한 정보를 재정의해서 적으면 되는 것이다
}

