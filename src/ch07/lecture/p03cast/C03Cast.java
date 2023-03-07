package ch07.lecture.p03cast;

public class C03Cast {
	public static void main(String[] args) {
		method1(new Animal());
		method1(new Horse());
		method1(new Fish());
		//자동 형변환
		
		System.out.println("실행 흐름");
	}
	
	public static void method1(Animal a) {
		//어떤 인스턴스가 넘어오든 에니멀객체가 있다는 것이 보장된다
		a.breath();
		
		
		//만약 말 객체이면 실행
		if(a instanceof Horse) {
			
			Horse h = (Horse) a;
			h.run();
		}
		
//		Horse h = (Horse) a;
//		h.run();
		//위험한 코드
	}
}
