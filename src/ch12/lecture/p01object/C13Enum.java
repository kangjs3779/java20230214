package ch12.lecture.p01object;

public class C13Enum {
	public static void main(String[] args) {
		Season season = Season.FALL;
		
		String a = switch (season) {
		case SPRING, FALL -> "좋은 계절이다";
		case SUMMER -> "덥다";
		case WINTER -> "춤다";
//		default -> "잘못입력"; 생략해도 된다
		};
	}
}
