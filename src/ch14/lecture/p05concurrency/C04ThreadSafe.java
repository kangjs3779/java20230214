package ch14.lecture.p05concurrency;

import java.util.concurrent.atomic.*;

public class C04ThreadSafe {
	static int field = 0;
	//이 값을 안전하게 thread에 
	//thread safe integer operation java(google) - atomicInteger
	static AtomicInteger atomicFiled = new AtomicInteger(0);
	public static void main(String[] args) {
		// 또 다른 해결책 3
		Thread a = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				field++;
				atomicFiled.getAndIncrement();
			}
		});

		Thread b = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				field++;
				atomicFiled.getAndIncrement();
			}
		});

		a.start();
		b.start();
		try {
			a.join();
			b.join();
		} catch (Exception e) {
		}
		System.out.println(field);

	}
}
