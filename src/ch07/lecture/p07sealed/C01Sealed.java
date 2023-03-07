package ch07.lecture.p07sealed;

public class C01Sealed {
	
}

sealed class Super01 permits Sub011, Sub012{
	
	//봉인했다 라는 뜻을 가짐
	//뒤에 있는 두개의 클래스만 상속받을 수 있다는 뜻
	//sealed class 특정 클래스만 상속 허용
}

//sealed class를 상속한 클래스는 final로 선언
final class Sub011 extends Super01 {
	
}

final class Sub012 extends Super01 {
	
}

final class Sub013 extends Super01 {
	//안된다
}
