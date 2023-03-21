package ch11.lecture.p04throw;

import javax.management.*;

public class C04Throw {
	public static void main(String[] args) {
		method1();
		//어쨋든 예외를 던졌기 떄문에 catch를 사용하지 않으면 예외가 발생해서
		//아래의 코드가 실행되지 않는다
		//계속 실행시키고 싶으면 catch를 사용하면 된다ㅓ
		System.out.println("continue");
	}
	
	public static void method1() {
		throw new RuntimeException();
		//얘는 unchecked exception이기때문에
		//throw 키워드를 써도되고 안써도 된다
		//어차피 컴파일러가 확인하지 않으니까
		
	}
}
