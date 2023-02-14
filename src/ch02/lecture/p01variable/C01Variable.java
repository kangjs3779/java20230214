package ch02.lecture.p01variable;

public class C01Variable {
	
	public static void main(String[] args) {
		int age;
		double average;
	
	//변수
	//값을 담을 수 있는 이름있는 공간
	
	//변수 선언
	//타입 변수명;
	
	//변수명
	//영문 대소문자, _, $, 숫자 조합으로 작성가능
	//작성관습 : lowerCamelCase
	//숫자로 시작을 하면 안된다
	int $;
	int Hello;
	int your_age; //관습에 따라서 이런건 쓰지말아라
	int yourAge; //관습에 따라서 작성을 해라
	int h3;
	int 3h; //숫자로 시작하면 안된다
	
	//변수를 여러개 선언가능
	int myAge, hisAge, herAge;
	
	//같은 이름의 변수 선언 불가
	int hi ;
	//int hi; 
	//같은 이름의 변수라서 안된다
	
	//변수에 값 대입(할당) : =
	hi = 3;
	int var1;
	var1 = 99;
	
	//변수 선언, 값대입
	int var2 = 100;
	
	//여러개 가능
	int var3 = 20, var4 = 30;
	
	//값을 할당하지 않은 변수 사용 불가
	//초기화 하지 않은 변수 사용 불가
	int var5;
	private void sysout(var5);
	
	//변수명 작성시 어떤 값을 갖는지 알아볼 수 있게 
	int koreanScore;
	//ks 약칭으로 작성하면 안된다
	//잘읽을 수 있어야하는데 가독성이 떨어짐
	int englishScore;
	}
}
