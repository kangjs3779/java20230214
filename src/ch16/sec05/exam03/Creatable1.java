package ch16.sec05.exam03;

@FunctionalInterface
public interface Creatable1 {
	public Member create(String id);
	//abstract method
	//Member타입에 create이라는 이름의 String id의 파라미터를 가진 method임
}
