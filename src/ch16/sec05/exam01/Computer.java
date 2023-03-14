package ch16.sec05.exam01;

public class Computer {
	public static double staticMethod(double x, double y) {
		return x + y;
	}
	//파라미터 더한 값이 리턴값
	
	public double instanceMethod(double x, double y) {
		return x * y;
	}
	//파라미터 곱한 값이 리턴값
}
