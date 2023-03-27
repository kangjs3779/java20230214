package ch18.review;

import java.io.FileInputStream;
import java.io.InputStream;

public class R03 {
	public static void main(String[] args) {

		try (InputStream is = new FileInputStream("reoutput/test1.txt")) {
			// 모든 데이터 출력해보기

			while (true) {
				int num = is.read();
				// 리턴값이 int니까 int로 받는
				if (num == -1)
					break;
				// num이 -1이 되면 반복문 끝남
				// 명령문 한개라서 중괄호 안씀
				System.out.println(num);
			}

		} catch (Exception e) {

		}
	}
}
