package ch08.lecture.p04etc;

public interface MyInterface05 {
	//public static final field
	
	
	
	
	
	//public static method
	//default, abstract, static 중에서 하나만 사용해야 한다
	//default와 abstract는 instance method이다
	//근데 static은 instance를 만들지 않고 접근할 수 있도록 하는 코드라서
	//함께 쓸 수 없다
	//instance method에는 static이 들어갈 수 있다
	//static안에는 instance가 들어갈 수 없다
	//그래서 private static 메소드가 있는 것이다
	static void  method1() {
		common();
		System.out.println("method1 code....");
	}
	
	static void method2() {
		common();
		System.out.println("method2 code....");
	}
	
	
	//인터페이스 안에있는 디폴트 메소드들의 공통된 코드이니까 밖에서 접근하지 못하도록 private으로 선언을 해주는 것이 좋다
	private static void common() {
		System.out.println("공통된 코드");
	}
	
	//public abstract instance method
	//public default instance method
	//private instance method
}
