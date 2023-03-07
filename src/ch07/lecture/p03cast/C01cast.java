package ch07.lecture.p03cast;

import ch06.sec13.exam02.package1.*;

public class C01cast {
	public static void main(String[] args) {
		
		Animal a1 = new Horse();
//		a1.breath();
		
		
//		Horse h1 = a1; //강제형변환이 필요함
		Horse h1 = (Horse) a1; //강제형변환 코드
		h1.run();
		//기본타입의 강제형변환도 어느정도 값을 잃을 것을 감안하고 강제형변환을 진행했다
		//이것도 어느정도 값을 잃을 것을 감안하고 진행하는 것이다
		//강제 형변환(type cast)
		//타입을 바꿀 수는 있지만 위험하다
//		Animal a2 = new Fish();
//		a2.breath();
//		
//		Fish f1 = (Fish) a2;
//		f1.swim();
	}
}

class Fish extends Animal {
	@Override
	public void breath() {
		System.out.println("아가미호흡한다");
	}
	
	public void swim() {
		System.out.println("헤엄치다");
	}
}

class Horse extends Animal {
	@Override
	public void breath() {
		System.out.println("폐호흡한다");
	}
	
	public void run() {
		System.out.println("달립니다");
	}
}

class Animal {
	public void breath() {
		System.out.println("호흡한다");
	}
}
