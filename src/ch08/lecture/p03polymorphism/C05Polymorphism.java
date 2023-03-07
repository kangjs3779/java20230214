package ch08.lecture.p03polymorphism;

public interface C05Polymorphism {
	public static void main(String[] args) {
		String s1 = "hello world";
		StringBuilder s2 = new StringBuilder();
		
		String str = s1.replace(s2, "java");
		System.out.println(str);
	}
}
