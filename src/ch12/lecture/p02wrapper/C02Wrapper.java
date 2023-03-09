package ch12.lecture.p02wrapper;

public class C02Wrapper {
	public static void main(String[] args) {
		int i1 = 3;
		Integer o1 = i1; //현재버전(auto boxiong)
		//그냥 이렇게 쓰면 된다
		
		//초기버전에서는 안됐음
		//기본타입을 참조타입으로 넣는 건데 저장방법이 달라서 안됐었음
		//현재버전에서는 된다 
		Integer o2 = new Integer(i1);
		//그래서 예전에는 이렇게 썼다(포장, boxing)
		Integer o3 = Integer.valueOf(i1); //지금 버전(권장)(포장 boxing)
		//포장한 객체를 리턴을 해준다
		
		Number o4 = i1; //auto boxing, 자동형변환이 한번에 일어난 것이다
		Object o5 = i1; //auto boxing, 자동형변환
		
		
	}
}
