package ch15.exercise.chec08;

import java.util.*;

public class Student {
	public int studentNum;
	public String name;
	
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentNum == other.studentNum;
	}
	
	
}
