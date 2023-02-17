package ch03.lecture.p01arithmetic.example;

public class C08_1CheckQuestion {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudents = pencils / students;
		System.out.println(pencilsPerStudents);
		
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);
	}
}
