package ch06.lecture.p09package;

import ch06.lecture.p09package.package1.MyClass04;

public class C04Import {
	public static void main(String[] args) {
		MyClass04 o1 = new MyClass04();
		//같은 이름의 클래스가 있을 때 import를 하면
		//창이 뜨고 원하는 걸 선택하면 된다
		
		MyClass04 02 = new MyClass04();
		//얘는 패키지2에 있는 애를 쓰고 싶다면
		//이미 패키지1에 있는 애를 import했으니까
		//패키지2에 있는 애는 풀네임을 써야 한다
		
	}
}
