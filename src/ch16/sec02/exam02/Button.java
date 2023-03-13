package ch16.sec02.exam02;

public class Button {
	
	@FunctionalInterface
	public static interface ClickListener {
		void onClick();
	}
	//추상메소드가 하나인 functional interface
	
	private ClickListener clickListener;
	//인터페이스타입 필드 선언
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	//파라미터 값을 받는 setter
	//파라미터 값이 곧 인터페이스 값이 됨
	//메소드 실행은 시키지 않음
	
	public void click() {
		this.clickListener.onClick();
	}
	//메소드 선언
	//인터페이스타입 변수를 이용하여 인터페이스 안에 있는 메소드 실행
}
