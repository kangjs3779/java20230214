package ch19.lecture.p02http;

import java.io.*;
import java.net.*;

public class C03Server {
	public static void main(String[] args) {
		// 스레드로 여러 요청이 가능하도록 함
		// 스레드 추가
		//실행을 한번 하면 계속 되고 있으니까 콘솔에서 닫기버튼 눌어줘야함
		//실행 눌러서 열어주고 아이피 주소 적어주면 여러명도 받을 수 있음
		int port = 80;

		try (
				ServerSocket serverSocket = new ServerSocket(port);) {

			System.out.println("요청 기다리는중..");

			while (true) {
				Socket socket = serverSocket.accept();

				Thread t = new Thread(() -> {

					try (	socket;
							OutputStream os = socket.getOutputStream();
							PrintStream ps = new PrintStream(os);) {

						String body = """
								<h1>This is NAVER!!</h1>
								<h3>다른 사이트로 이동 </h3>
								<ul>
									<li><a href="https://www.daum.net">daum</a></li>
									<li><a href="https://www.google.com">google</a></li>
								</ul>
								<p> 내가 만든 것 </p>
								""";
						int length = body.getBytes().length;

						// 첫 줄
						ps.println("HTTP/1.1 200 OK");

						// 두번째 줄부터 헤더들
						ps.println("Content-Type: text/html; charset=utf-8");
						ps.println("Content-Length: " + length);

						// 빈 줄
						ps.println();

						// 응답 본문
						ps.println(body);

						ps.flush();
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
				
				t.start();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("서버 종료!");
	}
}
