package ch03.lecture.p04logical;

public class C02Logical {
	public static void main(String[] args) {
		// ^ (xor : exclusive or(배타적 논리합))
		//피연산자가 다르면 결과 true
		//			 같으면 결과 false
		
		System.out.println(true ^ true); //f
		System.out.println(true ^ false);//t
		System.out.println(false ^ true);//t
		System.out.println(false ^ false);//f
		
		// & and
		// 피연산자가 모두 true이면 true
		//			  나머지는 false
		System.out.println(true & true);  //t
		System.out.println(true & false);  //f
		System.out.println(false & true);  //f
		System.out.println(false & false);  //f
		
		// | or
		// 피연산자가 모두 false이면 false
		//			  나머지는 true
		System.out.println(true | true);  //t
		System.out.println(true | false);  //t
		System.out.println(false | true);  //t
		System.out.println(false | false);   //f
		
		
	}
}
