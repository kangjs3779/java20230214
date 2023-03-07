package ch07.review;

public class review05 {
	public static void main(String[] args) {
		
		//부모타입에 들어간 이상 부모에게는 없는 자식의 메소드를 사용할 수 없다
		//자식은 부모를 선택해서 부모의 존재를 알지만 부모는 자식을 알 방법이 없다
		//그래서 자식에게 있는 메소드나 필드를 사용할 수 없다
		
		Animal a1 = new Fish();

		boolean b1 = a1 instanceof Animal; 
		boolean b2 = a1 instanceof Horse; 
		boolean b3 = a1 instanceof Fish; 

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	
	}
}

class Animal {
	public void breath() {
		System.out.println("호흡한다");
	}
	
	public void move() {
		System.out.println("움직인다");
	}
	
	public void animal() {
		System.out.println("동물이다");
	}
}

class Horse extends Animal {
	public void breath() {
		System.out.println("폐호흡한다");
	}
	
	public void move() {
		System.out.println("달린다");
	}
	
	public void horse() {
		System.out.println("말이다");
	}
}

class Fish extends Animal{
	public void breath() {
		System.out.println("아가미호흡한다");
	}
	
	public void move() {
		System.out.println("헤엄치다");
	}
	
	public void fish() {
		System.out.println("물고기다");
	}
}
