package ch07.lecture.p04abstract;

//추상 클래스(abstract class)
//이 클래스로 인스턴스를 만들 수 없음
public abstract class Animal {
	public abstract void breath();
	//추상 매소드
	//몸통(body) 없는 메소드
	//리턴타입앞에 abstract를 적어주면 된다
	//만약 본다라는 개념은 굳이 재정의를 하지않아도 말과 물고기 모두 가지고 있는 거라면 적어도 되지만
	//폐호흡과 아가미호흡의로 재정의가 되어야 한다면 굳이 적을 필요는 없다
	//추상메소드가 있는 클래스는 추상클래스이어야 함
	//상속 받는 클래스에서 꼭 재정의 해야 함(말과 물고기는 어떤 호흡을 하는지 꼭 정의해줘야 한다)
	
}
