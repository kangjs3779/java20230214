package ch06.sec08.exam02;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		//class Computer에 접근을 하기 위해 instance를 만들어서 그에 대한 
		//참조값을 myCom에 넣음
		int result1 = myCom.sum(1, 2, 3);
		System.out.println("result1 : " + result1);
		
		int result2 = myCom.sum(1, 2, 3, 4, 5);
		System.out.println("result2 : " + result2);
		
		int[] values = {1, 2, 3, 4, 5}; 
		//파라미터에 배열을 만들어 넣어줌
		int result3 = myCom.sum(values);
		//class Computer에 접근하기 위해 그것의 참조값을 가진
		//myCom에 있는 참조값을 통해 sum 메소드를 호출함
		//그리고 그 파라미터는 내가 다시 선언한 values가 들어간다
		//values의 원소들의 총합이 result3이 된다
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum(new int[] {1, 2, 3, 4, 5});
		System.out.println("result4 : " + result4);
		//이렇게는 잘 안씀
	}
}
