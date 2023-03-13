package ch16.lecture.p02lambda;

public class C02Lambda {
	public static void main(String[] args) {
		//파라미터 없으면 빈 ()
		//메소드 body는 {}
		MyInterface02 o1 = () -> {
						//파라미터부터 시작한다
			//메소드 body
			System.out.println("메소드 body 작성");
		};
		
		//() -> {} 이걸 묶어서 람다식이라고 한다
		//메소드의 명령문이 하나이면 중괄호 생략 가능함, 엔터 칠 필요없이 한 줄로 사용가능함
		//하나일때만~~
		//두개 이상의 statement가 있으면 생략하면 안된다
		//람다에서는 생략 가능하면 최대한 생략하는게 좋다
		//전에 생략에 대해서 말했을 떄에는 그냥 왠만하면 생략하지 말라고 했는데
		//람다에서는 최대한 생략하는 것이 좋다
		//읽기 좋음
		//람다는 생략할 수록 읽기 쉬움
		
		MyInterface02 o2 = () -> {
			System.out.println("명령문이 여러개1");
			System.out.println("명령문이 여러개2");
		};
		//이때는 중괄호 생략할 수 없음
		//명령문이 두개라서
	}
}

@FunctionalInterface
interface MyInterface02 {
	//파라미터가 없는 추상메소드
	void method();
	
}
