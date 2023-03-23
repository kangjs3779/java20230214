package ch14.sec03.exam03;

import java.awt.*;

public class BeepPrintExample {
	public static void main(String[] args) {
		//소리랑 프린트랑 같이 함
		Thread thread = new Thread() {
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch (Exception e) {}
				}
			}
		};
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
