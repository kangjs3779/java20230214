package ch09.sec07.exam03;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		//button class 객체만들기
		
		//변수를 통해 setter 접근
		//파라미터 버튼 안에 있는 인터페이스 - 익명 개체를 통해 메소드 재정의
		btnOk.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Ok버튼을 클릭했습니다");
			}
		});
		
		btnOk.click();
		//재정의 된 인터페이스 안에 있는 메소드 실행
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다");
			}
		});
		
		btnCancel.click();
	}
}
