package ch07.exam.check06;

public class Child extends Parent{
	public int studentNo;
	
	public Child(String name, int studentNo) {
		super("kang"); //상위 객체 생성자를 호출해야 한다
		//기본 생성자 삽입이 안되니까 코드로 작성해 주어야 한다
		this.name = name;
		this.studentNo = studentNo;
	}
}
