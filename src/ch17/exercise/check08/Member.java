package ch17.exercise.check08;

public class Member {
	private String name;
	private String job;
	
	public Member(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String getJob() {
		return job;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "{name:" + name + ", job:" + job + "}";
	}
}
