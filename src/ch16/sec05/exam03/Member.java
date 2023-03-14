package ch16.sec05.exam03;

public class Member {
	private String id;
	private String name;
	
	public Member(String id) {
		this.id = id;
		System.out.println("Member(String id)");
	}
	//constructor 생성
	//파라미터가 하나임
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Member(String id, String name");
	}
	//생성자 선언
	//파라미터가 두개임
	
	@Override
	public String toString() {
		String info = "{ id: " + id + ", name: " + name + " }";
		return info;
	}
	//모든 클래스의 상위클래스인 Object의 메소드 toString을 재정의함
}
