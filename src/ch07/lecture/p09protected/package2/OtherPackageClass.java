package ch07.lecture.p09protected.package2;

public class OtherPackageClass {
	public void someMethod() {
		Super01 o1 = new Super01();
		o1.method1(); //다른 패키지여서 안된다
	}
}
