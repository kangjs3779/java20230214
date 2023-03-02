package ch06.lecture.p09package;

import ch06.lecture.p09package.package1.MyClass05;

import static ch06.lecture.p09package.package1.MyClass05.name;
import static ch06.lecture.p09package.package1.MyClass05.method1;
import static ch06.lecture.p09package.package1.MyClass05.method2;
//static import
// : static member(field, method)


public class C05StaticImport {
	public static void main(String[] args) {
		String n = MyClass05.name;
		
		MyClass05.method1();
		MyClass05.method2();
		
		//짧게 쓸 수 있다
		//가독성이 떨어지니까 조심해서 써라
		
		String m = name;
		
		method1();
		method2();
		
		
	}
}
