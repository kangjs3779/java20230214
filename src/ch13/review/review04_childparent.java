package ch13.review;

public class review04_childparent {
	public static void main(String[] args) {
		
		Parent p2 = new Parent();
		//부모 타입에 부모값
		Child c2 = p2; //안됨
		//자식 타입에 부모값
		
		Parent p1 = new Child();
		//부모 타입에 자식값
		Child c1 = p1; //안됨
		//자식 타입에 부모타입 자식값 
		
		Child c3 = new Child();
		//자식 타입에 자식값
		Parent p3 = c3;
		//부모타입에 자식값
		
		Child c4 = new Parent();
		//자식 타입에 부모값
		
		//자식값은 부모 자식타입에 들어갈 수 있음
		//부모값은 부모타입에 들어갈 수있음
		
		//부모타입 - 자식값, 부모값
		//자식타입  - 자식값
		
		
	}
	
}

class Parent {}
class Child extends Parent{}