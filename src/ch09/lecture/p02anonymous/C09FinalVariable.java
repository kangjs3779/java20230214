package ch09.lecture.p02anonymous;

public class C09FinalVariable {
	// 로컬 클래스는 감싸고 있는 메소드의 지역 변수(파라미터)를 사용할 수 있다
	//이때 이 지역변수(파라미터)는 final 이어야 한다.
	
	public static void main(String[] args) {
		final int i = 10;
		
		class LocalClass {
			void method1() {
				System.out.println(i);
			}
		}
	}
	
	
	public void method1() {
		int i = 1; //오류가 안남
		//값을 한번밖에 선언하지 않음 final과 다름이 없음
		//effectively final
		
		
		class LocalClass {
			void method2() {
				System.out.println(i);
			}
		}
	}
	
	
	public void mehtod2(final int param) {
		//파라미터가 final임
		
		class LocalClass {
			void method3() {
				System.out.println(param);
			}
		}
	}
	
	//effectively final parameter
	public void method3(int param) {
//		param = 3;
		//사실상 final이 아니라서 이렇게는 사용할 수 없다
		//메소드를 실행할 때 값을 할당 받을 텐데
		//메소드 안에서 또 값을 할당하면 final이 안되니까 안되는 거다
		
		class LocalClass {
			void method4() {
				System.out.println(param);
			}
		}
	}
	
	//이런 일은 감싸고 있는 메소드에서만 일어난다
	
}
