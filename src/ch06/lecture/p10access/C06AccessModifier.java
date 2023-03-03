package ch06.lecture.p10access;

public class C06AccessModifier {
	public static void main(String[] args) {
		MyClass06 o1 = new MyClass06();
		ch06.lecture.p10access.package1.MyClass07 o3 = new ch06.lecture.p10access.package1.MyClass07();
		//MyClass07은 package private이라서 호출이 안된다
	}
}
