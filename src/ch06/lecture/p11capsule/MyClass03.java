package ch06.lecture.p11capsule;

public class MyClass03 {
	private String name;
	private int age;
	private String address;
	private boolean married;
	
	public void setMarried(boolean married) {
		this.married = married;
	}
	//boolean 타입의 getter는 is로 시작
	public boolean isMarried() {
		return married;
	}
	
	
	//메소드 통해서 필드에 접근하도록 할 것
	//변경하는 용도 - set필드명
	//읽는 용도 - get필드명
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
