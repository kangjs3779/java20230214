package ch06.lecture.p03method;

public class C10VarArgs {
	public static void main(String[] args) {
		System.out.printf("%d%n", 99);
		System.out.printf("%10s, %10s%n", "hello", "world");
		System.out.printf("hi java%n");
		//printf의 두번째 파라미터는 가변길이 아규먼트 였다
		//tooltip으로 두번째 파라미터가 가변길이 아규먼트인 것을
		//확인할 수 있다
	}
}
