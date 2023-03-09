package ch12.review;

import java.util.*;

public class review04 {
	public static void main(String[] args) {
		Set set = new HashSet<>();
		
		set.add(new StudentData("kang", 5426));
		set.add(new StudentData("park", 5555));
		set.add(new StudentData("kang", 5426));
		
		System.out.println(set.size());

	}
}

class StudentData {
	private String name;
	private int StudentNum;
	
	public StudentData (String name, int StudentNum) {
		this.name = name;
		this.StudentNum = StudentNum;
	}

	@Override
	public int hashCode() {
		return Objects.hash(StudentNum, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentData other = (StudentData) obj;
		return StudentNum == other.StudentNum && Objects.equals(name, other.name);
	}


	
	
}
