package lvl3.ex01;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Main {
	public void main() {
		Student student1 = new Student("Jose", "php", 25, 7.4);
		Student student2 = new Student("carla", "java", 34, 5.4);
		Student student3 = new Student("montserrat", "javascript", 15, 6.4);
		Student student4 = new Student("Andrea", "php", 65, 4.9);
		Student student5 = new Student("Juan", "java", 45, 7.3);
		Student student6 = new Student("roberto", "java", 28, 5.6);
		Student student7 = new Student("josep", "python", 29, 2.7);
		Student student8 = new Student("antonio", "c", 19, 9.8);
		Student student9 = new Student("lorena", "java", 16, 3.4);
		Student student10 = new Student("ximena", "python", 22, 5.66);
		System.out.println("List of all the students names with their ages \n");
		List<Student> studentsList = Arrays.asList(student1, student2, student3, student4, student5, student6, student7,
				student8, student9, student10);
		studentsList
				.forEach(o -> System.out.println("Student name: " + o.getName() + " is " + o.getAge() + " years old."));
		System.out.println("\nList of students whose names start with the letter a");
		List<Student> studentsNamedWithA = studentsList.stream().filter(o -> o.getName().toLowerCase().startsWith("a"))
				.collect(Collectors.toList());
		studentsNamedWithA.forEach(o -> System.out.println(o.getName()));
		System.out.println("\nStudents with a grade > 5 ");
		List<Student> passingGradeStudents = studentsList.stream().filter(o -> o.getGrade() > 5)
				.collect(Collectors.toList());
		passingGradeStudents.forEach(
				o -> System.out.println("Student : " + o.getName() + " has a obtained a grade of " + o.getGrade()));
		System.out.println("\nStudents with a grade > 5 that are not from the php course");
		List<Student> notPhpPassingGradeStudents = studentsList.stream()
				.filter(o -> o.getGrade() > 5 && !o.getCourse().toLowerCase().contentEquals("php"))
				.collect(Collectors.toList());
		notPhpPassingGradeStudents.forEach(o -> System.out
				.println(o.getName() + " from the course " + o.getCourse() + " got a score of " + o.getGrade()));
		System.out.println("\nJava students that are over 18 years old");
		List<Student> javaAdultStudents = studentsList.stream()
				.filter(o -> o.getCourse().toLowerCase().contentEquals("java") && o.getAge() >= 18)
				.collect(Collectors.toList());
		javaAdultStudents.forEach(
				o -> System.out.println(o.getName() + " from the java course is " + o.getAge() + " years old"));
	}
}
