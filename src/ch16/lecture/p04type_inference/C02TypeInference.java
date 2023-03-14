package ch16.lecture.p04type_inference;

import java.util.*;

public class C02TypeInference {
	//var a = 5;
	//이건 field영역이라 안된다
	
	public static void main(String[] args) {
		//지역변수 타입 추론
		int a = 3;
		String b = "java";
		//타입 유추 가능
		
		var c = 5;
		var d = "hello";
		//변수의 타입을 생략할 수 있음
		//var라는 키워드로
		//이건 지역변수에만 일어나느 것임
		//field에서는 일어나지 않는다
		//필드는 클래스 안에 있는 값
		//지역변수는 메소드 안에 있는 값
		//선언과 동시에 초기화할 때만 사용 가능
		//들어가는 값에 의해서 추론이 가능 하기 때문에 선언과 동시에 초기화값을 넣어줘야 한다
		
		Box<String> box1 = new Box<String>();
		Box<String> box2 = new Box<>();
		var box3 = new Box<String>();
		//보통은 왼쪽의 타입을 보고 오른쪽 값의 타입을 추론했지만
		//var는 오른쪽의 값을 보고 타입을 추론하는 것이다
		
		var list1 = new ArrayList<List<String>>();
		
		//재할당시 같은 타입만 가능
		var f = 10; //int로 추론
		f = 11;
		f = 3.14; //안된다.
		
		//var 사용 시 읽기 쉬운코드인가???
		//변수의 타입이 너무 멀리 있으면 좀 읽기 어려움
		
		var list2 = new ArrayList<String>();
		//긴 코드
		//ok
		for(String item : list2) {
			
		}
		
		//권장하지 않음
		for (var item : list2) {
		//타입을 추론하기 쉽지 않음	
		}
		
		
		//var는 키워드가 아님
		int var = 3; //사용가능
		//사용 가능 하지만 변수명으로 사용하지 말 것
		
		
		
		
		
	}
}






