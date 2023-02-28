package ch06.lecture.p03method;

public class MyClass12 {
	void method1() {
		
		return 3; 
		//1. 메소드 종료 2. 오른쪽 값을 호출한 곳으로 return(반환)
		//2번 목적으로 쓰였으면 return타입과 메소트타입과 일치해야 한다
		//return옆에 있는 숫자는 integer값이라서 안된다
		//메소드는 void타입이기 때문에
	}
	
	int method2() {
		//메소드에 리턴타입을 명시하면
		//해당차입의 값을 꼭 리턴을 해야한다
		if (true) {
			return 1;
		}
		//조건문이 true라고 해도 조건문은 return값이 안나올 수도 있는 
		//명령문이라서 문법 오류가 났다
		//왜냐면 꼭! return값이 필요하기 때문이다
//		return 1;
		//정수타입의 return값이 꼭 필요하다
		return 5;
	}
	
	//자동형변환
	int method3() {
		int a = 3;
		return a;
	}
	
	int method4() {
		long a = 3L;
		
		return a;
		//타입이 달라서 안된다
	}
	
	int method5() {
		short a = 6000;
		return a;
		//자동형변환이 되어서 가능함
	}
	
	double method6() {
		double a = 3.14;
		
		return a;
	}
	
	double method7() {
		long l = 33;
		
		return l;
		
		//자동형변환
	}
	
	//리턴이 없으면 void로 리턴타입 명시
	void method8() {
		return 3;
		//값이 없다고 명시를 했기때문에 return값을 적으면 안된다
		//쓴다면 return은 종료 역할로만 사용을 해야 한다
		return;
	}
 }








