package ch07.lecture.p08super;

public class C01Super {
	public static void main(String[] args) {
		Sub01 o1 = new Sub01();
		
	}
}

class Super01 {
	//이 클래스로 인스턴스 만들 때 해야 하는 일 = 초기화 작업 1
	Super01() {
		System.out.println("상위 클래스 초기화 코드");
	}
}
class Sub01 extends Super01 {
	Sub01() {
		//그 전에 상위 클래스의 초기화 작업 해야 함 1
		//상위 클래스 생성자 호출 코드
		super(); //이건 꼭 먼저 해야 한다 - 작성하지 않으면 자동으로 삽입된다
		//먼저일어나야 하는 거라서 다른 코드보다 밑에 있을 수 없다
		
		//이 클래스로 인스턴스 만들 때 해야 하는 일 2
		System.out.println("하위 클래스 초기화 코드");
		
		
	}
	
}
