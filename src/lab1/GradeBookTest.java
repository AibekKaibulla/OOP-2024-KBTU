package lab1;
import practice2.Student;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class GradeBookTest {
	public static void main(String[] args) {
		Course course = new Course("CS101", "Object-orientied Programming and Design", 4, null);
		
		List<Student> students = Arrays.asList(
	            new Student("Student A", 1),
	            new Student("Student B", 2),
	            new Student("Student C", 3),
	            new Student("Student D", 4),
	            new Student("Student E", 5)
	   );
		
		GradeBook gradeBook = new GradeBook(course, students);
		gradeBook.displayMessage();
		
		Scanner scanner = new Scanner(System.in);
		for (Student student : students) {
			System.out.print(student.getName() + ": ");
			int grade = scanner.nextInt();
			gradeBook.addGrade(student, grade);
		}
		
		gradeBook.displayGradeReport();
		
		// System.out.println(gradeBook);
	}
} 