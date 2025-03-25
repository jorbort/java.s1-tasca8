package lvl3.ex01;

public class Student {
	private String name;
	private String course;
	private int age;
	private double grade;

	public Student(String name, String course, int age, double grade) {
		this.name = name;
		this.course = course;
		this.age = age;
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public String getCourse() {
		return course;
	}

	public double getGrade() {
		return grade;
	}

	public String getName() {
		return name;
	}
}
