package ch06.lecture.p05this;

public class MyClass01 {
	//instance field
	String name;
	
	//instance method
	void printName() {
		System.out.println(this.name);
		System.out.println(this.now());
		//o1을 대체하는 키워드임
	}
	//아직 만들어지지 않은 객체의 참조값 = this
	//자동차를 만드는 중에는 자동차가 없는데
	//있는 것처럼 쓰는 것 this
	//this : 참조변수를 대체하는 키워드
	
	String now() {
		return "세시 십분";
	}
}
