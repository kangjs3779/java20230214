package ch05.lecture.p07arrays;

public class C04ArrayCopy {
	public static void main(String[] args) {
		//책 188쪽
		int[] origin = {9, 8, 1, 2, 3};
		int[] target = new int[origin.length];
		
		System.arraycopy(origin, 0, target, 0, origin.length);
		//원본 배열이름, 원본배열 시작 위치 인덱스, 타켓배열 이름, 타켓배열 시작 위치 인덱스, 타겟배열 길이
		//위와 같이 적으면 완전한 배열 복사라고 생각하면 된다
		
	}
}
