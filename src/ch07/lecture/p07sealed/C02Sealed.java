package ch07.lecture.p07sealed;

public class C02Sealed {

}

sealed class Super02 permits Sub021 {}

//final class Sub021 extends Super02 {}
//final 또는 sealed로 적으면 된다
 sealed class Sub021 extends Super02 permits Sub03 {}
//상속 받은 클래스는 다시 sealed로 선언 가능
 
 final class Sub03 extends Sub021 {}
