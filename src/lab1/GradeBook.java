package lab1;
import practice2.Student;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class GradeBook {
	private Course course;
	private List<Student> students;
	private Map<Student, Integer> grades;
	
	public GradeBook(Course course, List<Student> students) {
		this.course = course;
		this.students = students;
		this.grades = new HashMap<>();
	}
	
	public GradeBook(Course course, List<Student> students, Map<Student, Integer> grades) {
        this.course = course;
        this.students = students;
        this.grades = grades;
    }
	
	public void displayMessage() {
		System.out.println("Welcome to the grade book for " + course.getName() + " " + course.getDescription() + "!");
	}
	
	public void displayGradeReport() {
        System.out.println("Class average is " + determineClassAverage() + ".");
        System.out.println("Lowest grade is " + findLowestGrade().getValue() + " (" +
            findLowestGrade().getKey().getName() + ", id: " + findLowestGrade().getKey().getId() + ").");
        System.out.println("Highest grade is " + findHighestGrade().getValue() + " (" +
            findHighestGrade().getKey().getName() + ", id: " + findHighestGrade().getKey().getId() + ").");
        outputBarChart();
    }

	
	private double determineClassAverage() {
        int total = 0;
        for (int grade : grades.values()) {
            total += grade;
        }
        return (double) total / grades.size();
    }
	
	private Map.Entry<Student, Integer> findHighestGrade() {
        return grades.entrySet()
                     .stream()
                     .max(Map.Entry.comparingByValue())
                     .orElse(null);
    }
	
	private Map.Entry<Student, Integer> findLowestGrade() {
        return grades.entrySet()
                     .stream()
                     .min(Map.Entry.comparingByValue())
                     .orElse(null);
    }
	private void outputBarChart() {
        int[] frequency = new int[11]; // 0-100 mapped to 10 intervals
        for (int grade : grades.values()) {
            frequency[grade / 10]++;
        }

        System.out.println("Grades distribution:");
        for (int i = 0; i < frequency.length; i++) {
            if (i == 10) {
                System.out.printf("%4d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }
            for (int j = 0; j < frequency[i]; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
	
	
	public void addGrade(Student student, int grade) {
		grades.put(student, grade);
	}
	
	public int getGrade(Student student) {
		return grades.getOrDefault(student, -1);	
	}
}
