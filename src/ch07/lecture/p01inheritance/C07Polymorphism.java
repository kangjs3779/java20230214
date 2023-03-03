package ch07.lecture.p01inheritance;

public class C07Polymorphism {
	public static void main(String[] args) {
		
		Animal a1 = new Horse();
		Animal a2 = new Fish();
		
		a1.breath();
		a2.breath();
	}
}

class Animal {
	public void breath() {
		
	}
}

class Horse extends Animal {
	@Override //상속받은 메소드나 필드를 재정의 하는 것
	public void breath() {
		System.out.println("폐로 호흡하다");
	}
}

class Fish extends Animal {
	@Override
	public void breath() {
		System.out.println("아가미로 호흡하다");

	}
}
