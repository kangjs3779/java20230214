package ch03.lecture.p04logical;

public class C01Logical {
	public static void main(String[] args) {
		//논리연산자
		// && ||(or) !
		// ^(배타적 논리합), &, |
		//여섯개 전부는 피연산자 = boolean  연산결과 - boolean
		
		
		//&& and : 두항이 모두 true일 때만 결과 true
		// 			나머지는 모두 false
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		//|| or : 두 항이 모두 false일 떄만 결과 false
				//나머지는 모두 true
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
		//! not : 하나의 피연산자
		//		 피연산자가 false면 결과 true
		//		 피연산자가 true면 결과 false
		System.out.println(!true);
		System.out.println(!false);
		//결과가 반전 된다
		
		
		
		
	}
}
