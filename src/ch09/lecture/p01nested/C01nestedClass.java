package ch09.lecture.p01nested;

public class C01nestedClass {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		MyClass01.Nested01 o2 = o1.new Nested01();
	}
}


//중첩클래스(nested class)
class MyClass01 {
	//class
	class Nested01 {
		//field
		//constructor
		//method
		
	}
	//field
	
	//constructor
	
	//method
}
