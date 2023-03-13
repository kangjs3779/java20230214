package ch16.review;

public class review06 {
	public static void main(String[] args) {
//		Person person = new Person();
//		
//		person.action(() -> {
//			System.out.println("출근을 합니다");
//			System.out.println("퇴근을 합니다");
//		});
		System.out.println("------------------------");
		
		Workable o1 = new Workable() {
			
			@Override
			public void work() {
				System.out.println("출근을 합니다");
				System.out.println("퇴근을 합니다");
			}
		};
		
		o1.work();
		
	}
}

@FunctionalInterface
interface Workable {
	void work();
}


