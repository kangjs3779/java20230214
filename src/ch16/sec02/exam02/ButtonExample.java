package ch16.sec02.exam02;

//412(concrete class) 를 생략해서 -> 420(anonymous)를 생략해서 -> 700(lambda)
public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		//클래스 객체화
		
		btnOk.setClickListener(() -> {
			System.out.println("Ok 버튼을 클릭하였습니다");
		});
		//객체를 통한 setter 접근
		//파라미터 값으로는 람다식을 통해 메소드 재정의
		//어차피 변수 타입을 알고 있고 추상메소드 하나니까 충분히 추론 가능
		//아직 메소드 실행은 안시킴
		
		btnOk.click();
		//클래스 안에있는 메소드 실행
		//재정의한 메소드가 실행된다
		
		Button btnCancel = new Button();
		//새로운 객체화
		
		btnCancel.setClickListener(() -> {
			System.out.println("Cancel버튼을 클릭했습니다");
		});
		//새로운 객체로 setter접근
		//파라미터로 재정의
		//파라미터 재정의한 것이 인터페이스에 들어감
		
		btnCancel.click();
		//메소드 실행
	}
}
