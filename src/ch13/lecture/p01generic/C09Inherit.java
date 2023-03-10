package ch13.lecture.p01generic;

public class C09Inherit {

}

class Super09<T> {}

class Sub09<T> extends Super09<T> {}
//부모가 제네릭이면 자식도 제네릭이어야 한다

class Super10<T, U> {}
class Sub10<T, U> extends Super10<T, U> {}
//제네릭 타입 변수 개수도 같아야 한다

class Super11<T> {}
class Sub11 extends Super11<String> {}
//구체적인 타입이 명시된 제네릭이면 생략가능

class Super12<T, U> {}
class Sub12<T> extends Super12<T, String> {}
//둘 중 하나면 타입이 명시되면 그 타입은 생략 가능

class Super13<T> {}
class Sub13<T,U> extends Super13<T>{}
//부모의 제네릭을 그대로 가져오고 자식한테 제네릭타입을 추가 가능

class Super14 <T extends Number> {}
class Sub14<T extends Integer> extends Super14<T> {}
//부모한테 상한선이 있으면 자식은 그 상한선을 넘을 수 없다
//상한선의 하위클래스로 제한 할 수 있다

