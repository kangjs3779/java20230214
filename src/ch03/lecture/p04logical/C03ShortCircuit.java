package ch03.lecture.p04logical;

public class C03ShortCircuit {
	public static void main(String[] args) {
		//&&
		//true && true : true
		//true && false : false
		//false && true : false
		//false && false : false
		//선행된 조건에서 결과가 확실하게 되면 뒤에 오는 조건은 보지 않고 결과를 출력한다
		
		int x = 10;
		if ((x++ > 0) && (x++ < 100)) {
			System.out.println("실행됨1");
		}
		System.out.println(x); //12
		
		x = 10;
		if ((x++ > 0) && (x++ < 5)) {
			System.out.println("실행됨2");
		}
		System.out.println(x);
		
		
		x = 10;
		if ((x++ > 100) && (x++ < 200)) {
			System.out.println("실행됨3");
		}
		
		System.out.println(x);
		
		x = 10;
		if ((x++ > 100) && (x++ < 0)) {
			System.out.println("실행됨4");
		}
		
		System.out.println(x); //shorcircuit으로 진행한다
		
		x = 10;
		if ((x++ > 100) & (x++ < 0)) {
			System.out.println("실행됨5");
		}
		
		System.out.println(x); //shortcircuit이 진행되지 않는다
	}
}
