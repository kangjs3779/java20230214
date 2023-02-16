package ch03.lecture.p01arithmetic;

public class C07Dvide {
	public static void main(String[] args) {
		//실수를 0으로 나누면 무한대 (infinity)
		double a = 0.0;
		double b = 3.0;
		
		double c = b / a;
		System.out.println(c);
		
		double d = -3.0;
		
		double e = d / a;
		System.out.println(e);
		
		//양의 무한대 음의 무한대가 있다
		//실수를 0으로 나눈 나머지 : NaN
		double f = 3.0 % 0.0; //NaN(not a number)
		System.out.println(f);
		
		double g = f + 1.0;
		System.out.println(g);
		
		//NaN 인지 무한대인지 확인하는 메소드가 있다
		boolean isinfinite1 = Double.isInfinite(c);
		System.out.println(isinfinite1);
		
		boolean isinfinite2 = Double.isInfinite(3.0);
		System.out.println(isinfinite2);
		
		//NaN인지 확인
		boolean isNaN1 = Double.isNaN(f);
		System.out.println(isNaN1);

		boolean isNaN2 = Double.isNaN(3.0);
		System.out.println(isNaN2);
	}
}
