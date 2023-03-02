package ch06.lecture.p07constructor;

public class MyClass11 {
	final String name = "son";
	final int age;
	
	MyClass11() {
		age = 99;
		//final은 꼭 값을 한번 할당해야하는데
		//어차피 생성자는 한번은 꼭 호출해야 하니까
		//final의 값을 생성자안에 넣어도 된다
	}
	
	MyClass11(int age) {
		age = 100;
		this.age = age;
		//이미 위에서 한번 값을 할당했기 때문에
	}
	
	MyClass11(String a) {
		a = "hello";
		this.age = 3;
	}
}
