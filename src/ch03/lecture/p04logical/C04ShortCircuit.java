package ch03.lecture.p04logical;

public class C04ShortCircuit {
	public static void main(String[] args) {
		// ||
		// true || true : true
		// true || false : false
		// false || false : true
		// false || false : false
		
		int x = 10;
		
		if ((x++ > 100) || (x++ < 0)) {
			System.out.println("실행됨1");
		}
		System.out.println(x); //12
		
		x = 10;
		if ((x++ > 100 || x++ > 0)) {
			System.out.println("실행됨2");
		}
		System.out.println(x);
		
		x = 10;
		if ((x++ > 0) || (x++ < 100)) {
			System.out.println("실행됨3");
		}
		//선행조건이 이미 true라서 뒤에 있는 걸 볼필요가 없음
		//그래서 x++가 적용되지 않음
		System.out.println(x);//그래서 11이 되었음
		
		x = 10;
		if ((x++ > 0) || (x++ < -100)) {
			System.out.println("실행됨4");
		}
		System.out.println(x);
		//별일 없으면 그냥 두개짜리 써야 효율적임
		
		
	}
}
