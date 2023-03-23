package ch14.sec03.exam01;

import java.awt.*;

public class BeepPrintExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500);
			} catch(Exception e) {}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch (Exception e) {}
		}
		
		//프린트와 소리가 동시에 났으면 좋겠다
		//동시에 진행하는 것이 멀티스레드 이다
	}
}
