package ch02.lecture.p05print;

public class C04Print {
	public static void main(String[] args) {
		//아규먼트는 순서대로 적용 된다
		System.out.printf("%d, %d%n", 3, 4);
		
		System.out.printf("%d, %f%n", 3, 3.14);
		//순서대로 아큐먼트가 적용이 되는데 타입에 맞게 값을 써줘야 한다
		
		System.out.printf("%f, %d, %s%n", 3.14, 999, "hello");
	}
}
