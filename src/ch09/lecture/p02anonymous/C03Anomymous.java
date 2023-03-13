package ch09.lecture.p02anonymous;

public class C03Anomymous {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03() {
			@Override
			void method1() {
				System.out.println("재정의한 메소드");
			}
		};
		//MyClass03을 상속받는 하위클래스의 이름을 따로 명시하지 않고 구현함
		
		
		o1.method1();
		//method1이 있다는게 보장됨
		//MyClass03을 상속받으니까
	}
}

abstract class MyClass03 {
	//콘크리트 클래스가 뭐더라? new를 통해서 인스턴스를 만들 수 있는 클래스
	//추상클래스를 만드는 이유 - 추상 메소드가 있어서
	abstract void method1();
}
