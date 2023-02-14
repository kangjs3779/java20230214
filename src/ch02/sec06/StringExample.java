package ch02.sec06;

public class StringExample {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다"; //큰따옴표를 출력하고 싶다
		System.out.println(str);
		
		str = "번호\t이름\t직업"; //사이사이에 탭을 넣은 것이다
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");//줄을 바꾸고 싶다
		System.out.print("배웁니다");
		//print는 파라미터를 출력하고 새로운 줄을 출력하지 않는다
		//println은 파라미터를 출력하고 새로운 줄을 출력한다
		//ln으로 하면 한 줄씩 새로운 줄이 생겨있음
	}
}
