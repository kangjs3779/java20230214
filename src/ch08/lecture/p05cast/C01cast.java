package ch08.lecture.p05cast;

public class C01cast {
	public static void main(String[] args) {
		MyInterface01 o1 = new MyClass01();
		
		//클래스 안에 있는 메소드1을 사용하고 싶은데
		//변수타입이 인터페이스라서 쓸 수 없음
		o1.method1();
		
		//그럼 강제 변환 해야함
		//파일명을 써주면 된다
		//근데 강제 형변환은 프로그램을 종료시킬 위험이 있으니까 
		//주의해야 한다
		MyClass01 o2 = (MyClass01)o1;
		
		o2.method01();
		
	}

}
