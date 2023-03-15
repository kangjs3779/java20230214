package ch16.sec04;

public class LambdaExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.action((x, y) -> {
			double result = x + y;
			return result;
		});
		
		person.action((x, y) -> (x + y));
		
		person.action((x, y) -> sum(x, y));
		//풀어쓰면
		person.action((x,y) -> {return sum(x, y);});
		
		
		
		
		public static double sum(double x, double y) {
			return (x + y);
		}
	}
}