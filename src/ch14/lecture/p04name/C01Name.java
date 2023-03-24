package ch14.lecture.p04name;

public class C01Name {
	public static void main(String[] args) {
		//현재 스레드 객체 얻기
		Thread t1 = Thread.currentThread(); //클래스이름으로 바로접근하는 거니 static메소드이겠다
		
		//스레드 이름 얻기
		System.out.println(t1.getName());
		
		//스레드 이름 바꾸기
		t1.setName("메인 스레드");
		
		System.out.println(t1.getName());
	}
}
