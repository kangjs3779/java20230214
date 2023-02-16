package ch02.lecture.p05print;

public class C10Print {
	public static void main(String[] args) {
		//flag
		//- : 오른쪽 정렬
		System.out.printf("%d%n", 33);
		System.out.printf("%5d%n", 33);
		System.out.printf("%-5d%n", 33);
		
		System.out.printf("%-10s", "son");
		System.out.print("띄어 쓰기 확인");
		
		// 0 : 0으로 채움(수)
		System.out.printf("%n%d%n", 99);
		System.out.printf("%5d%n", 99);
		System.out.printf("%05d%n", 99); //0으로 채우면서 5칸을 차지해라
		System.out.printf("%1$05d%n", 99); //index도 포함한 코드
		
		System.out.printf("%010f%n", 3.14);
		
		//precision : 소수점 이하 자릿수
		System.out.printf("%10.3f%n", 3.14); //10칸을 차지하는데 소수점은 3칸만 차지하는 실수를 적고 엔터쳐라
		System.out.printf("%10.3f%n", 3.5555); //소수점이 넘어가면 반올림을 한다
		System.out.printf("%10.6f%n", 3.14);
		System.out.printf("%1$010.3f%n", 3.55);//0을 채우는데 앞에 채워라
	}
}
