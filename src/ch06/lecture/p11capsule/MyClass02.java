package ch06.lecture.p11capsule;

public class MyClass02 {
	private int age;
	//특별한 이유가 없으면 field는 다 private로 하기
	//그리고 method를 public으로 하기
	public int getAge() {
		return this.age;
	}
	
	public void updateAge() {
		this.age++;
	}
}
