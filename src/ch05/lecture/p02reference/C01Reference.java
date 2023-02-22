package ch05.lecture.p02reference;

public class C01Reference {
	public static void main(String[] args) {
		//기본타입을 제외한 모두는 참조타입이다
		//저장되는 방식이 달라서 타입을 나눈 것이다
		int a = 3; //기본타입
		
		int[] arr = new int[] {3, 4, 5}; //참조타입
		//new - 오른쪽에 있는 값들을 저장할 공간을 새로 생성해라
		//얘도 연산자임
		//값들이 저장된 메모리의 주소를 출력한다 = new(값이 저장되어 있는 위치)
		//주소를 참조해서(가리킴) 저장된 값을 출력해낸다
		//new가 arr의 위치를 가리키고 있어서 참조타입인 것 이다
		// 즉 실제 저장된 공간은 따로 존재하고 그곳을 가리키고 있는 것이다 가리키는 것 = 주소
		
	}
}
