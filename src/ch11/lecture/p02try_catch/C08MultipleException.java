package ch11.lecture.p02try_catch;

public class C08MultipleException {
	public static void main(String[] args) {
		try {
			//여러 exception 발생 가능
			//catch블럭을 하나하나 확인하고 중간에 맞으면 아 맞네하고 블럭을 아예 나간다
		} catch (RuntimeException e) {
			e.printStackTrace();
			//이 catch블럭을 작성했을 때 밑에 세개가 오류가 나는 이유
			//도달할 수 없는 블럭이라서
			//runtime은 아래 세개의 상위타입이기 때문이다
			//아래 catch블럭의 exception보다 상위타입의 exception catch블럭을 먼저 작성할 수 없다
			//그리판 화살표 설명 필요할 것
			//하나하나 확인하고 중간에 맞으면 빠져나가는 그림
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("continue....");
	}
}
