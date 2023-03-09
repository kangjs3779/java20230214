package ch12.lecture.p02wrapper;

public class C03Autoboxing {
	public static void main(String[] args) {
		Byte b = 3; 
		Short s = 20000;
		Integer i = 200000;
		Long l = 99L;
		Float f = 3.14F;
		Double d = 3.14;
		Character c = '가';
		Boolean bool = true;
		
		//이 모든 것들은 Object에 공통적으로 다 들어갈 수 있다
		Object o1 = b;
		Object o2 = bool;
		Object o3 = i;
		Object o4 = l;
		
	}
}
