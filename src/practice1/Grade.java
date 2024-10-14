package practice1;
import java.util.Scanner;

class GradeConvert {
	public String getGrade(double number) {
		if (number >= 95 && number <= 100) {
			return "A";
		} else if (number >= 90 && number < 95) {
			return "A-";
		}
		else if (number >= 85 && number < 90) {
			return "B+";
		}
		else if (number >= 80 && number < 85) {
			return "B";
		}
		else if (number >= 75 && number < 80) {
			return "B-";
		}
		else if (number >= 70 && number < 75) {
			return "C+";
		}
		else if (number >= 65 && number < 70) {
			return "C";
		}
		else if (number >= 60 && number < 65) {
			return "C-";
		}
		else if (number >= 55 && number < 60) {
			return "D+";
		}
		else if (number >= 50 && number < 55) {
			return "D";
		}
		else if (number >= 0 && number < 50){
			return "F";
		} else {
			return "F";
		}
	}
}

public class Grade {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		GradeConvert gradeconvert = new GradeConvert();
		
		
		System.out.println("Enter the number: ");
		double number = scanner.nextDouble();
		
		String grade = gradeconvert.getGrade(number);
		System.out.println("The grade is: " + grade);

	}
}
