package ch02.lecture.p05print;

public class C07Print {
	public static void main(String[] args) {
		int age = 30;
		String name = "son";
		
//		System.out.printf("이름은 %s이고 나이는 %d입니다.%n", name, age);
//		System.out.printf("나이는 %d이고 이름은 %s이다.%n", age, name);
		
		System.out.printf("이름은 %2$s이고 나이는 %1$d입니다.%n", age, name);
		//원하는 특정 아규먼트를 선택하려면 1$ 2$를 원하는 코드 중간에 넣으면 된다
		//%s에 이름을 넣고 싶은데 두번째 아규먼트라면
		//%2$s라고 하면된다
	}
}
