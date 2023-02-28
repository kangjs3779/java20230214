package ch06.lecture.p05this;

public class MyClass02 {
	
	//instance field
	String name;
	
	//instance method
	void printName() {
		String name = "park";
		System.out.println(name); //local variable
		System.out.println(this.name); //instance field
		//this를 붙이면 위에 있는 name
		//this를 안붙이면 안에 있는 name
	}
	
	void setName(String name) {
		//파라미터 name을 필드 name에 할당
		//관습상 field와 같을 때에는 같은 이름을 쓰고 this를 사용한다
		//this 아직 만들어지지 않는 instance를 대체한다
		this.name = name;
	}
}
