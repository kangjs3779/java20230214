package ch09.lecture.p01nested;

public class C04LocalClass {
	void method1() {
		//로컬 클래스(local class)
		class LocalClass1 {
			//평소대로 쓰는 방법대로 쓰면 된다
			//딱 여기서만 쓰고 외부에서 쓸 일이 없을 때 이렇게 사용한다
			//16장을 배우고 나서 더 활용도가 높아질 것이다
		}
		
		LocalClass1 o1 = new LocalClass1();
		
	}
	
	void method2() {
		//LocalClass1 사용 못함
//		LocalClass1 o1 = new LocalClass1();
	}
}
