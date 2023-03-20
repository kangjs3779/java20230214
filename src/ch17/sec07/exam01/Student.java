package ch17.sec07.exam01;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() { return name; }
	public int getScore() { return score; }
	
	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
		//score - o.score
		//앞에스코어는 생성자에 있는 스코어, 뒤에는 파라미터 스코어임
	}
}
