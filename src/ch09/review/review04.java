package ch09.review;

public class review04 {
	public static void main(String[] args) {
		
	}
}

class MyClss04 {
	
	
	public void method1(int a) {
		
//		a = 0;
		
		//local class
		class LocalClass {
			void method2() {
				System.out.println(a);
			}
		}
		
		//로컬 객체 생성
		LocalClass local = new LocalClass();
		local.method2();
	}
}