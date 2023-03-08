package ch08.review;

public class Review02 {
	public static void main(String[] args) {
		Interface01 inter1 = new Class01();
		Interface01 inter2 = new Class02();
		
		System.out.println(inter1 instanceof Class01);
		System.out.println(inter1 instanceof Class02);
		
//		if (inter1 instanceof Class01) {
//			Class01 cast1 = (Class01) inter1;
//			System.out.println("같");
//		}
		
	}
}
