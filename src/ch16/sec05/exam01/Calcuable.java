package ch16.sec05.exam01;

@FunctionalInterface
public interface Calcuable {
	double calc(double x, double y);
}
//함수형 인터페이스
//추상메소드가 한개인 인터페이스
//선언함
//실수 타입의 추상 메소드 리턴값이 있어야 함