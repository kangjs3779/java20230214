package ch09.sec07.exam03;

public class Button {
	public static interface ClickListener {
		//인터페이스 만들기
		void onClick();
		//추상 메소드 선언하기
	}
	
	private ClickListener clickListener;
	//필드 선언
	//인터페이스 타입 필드 선언
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
		//값을 변경하는 setter
		//파라미터가 인터페이스 타입
	}
	
	public void click() {
		this.clickListener.onClick();
		//click메소드 선언
		//인터페이스 안에 있는 추상메소드 호출
	}
}
