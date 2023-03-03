package ch07.lecture.p01inheritance;

public class C06Polymorphism {
	public static void main(String[] args) {
		Sub06 o1 = new Sub06();
		Super06 o2 = o1;
		
		Super06 o3 = new Sub06();
		//된다
		
		Super06 o4 = new Super06();
		Sub06 o5 = o4;
		//안된다
		
		Sub06 o6 = new Super06();
		//안된다
		
		
	}
}
