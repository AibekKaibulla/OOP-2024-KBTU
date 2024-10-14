package practice1;
import java.util.Scanner;

public class Root {

	public static void main(String[] args) {
		// ax^2 + bx + c = 0
		// x = (-b ± √(b2-4ac)) / (2a)
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		double a = scanner.nextDouble();
		
		System.out.println("Enter b: ");
		double b = scanner.nextDouble();
		
		System.out.println("Enter c: ");
		double c = scanner.nextDouble();
		
		double discriminant = calculateDiscriminant(a, b, c);
		
		findAndPrintRoots(a, b, discriminant);
		
		scanner.close();
	}
	
	public static double calculateDiscriminant(double a, double b, double c) {
		return b * b - 4 * a * c;
	}
	
	public static void findAndPrintRoots(double a, double b, double discriminant) {
		if (discriminant < 0) {
			System.out.println("Error: discriminant D is negative");
		} else {
			double sqrtD = Math.sqrt(discriminant);
			double root1 = (-b + sqrtD) / (2 * a);
			double root2 = (-b - sqrtD) / (2 * a);
			
			if (discriminant == 0) {
				System.out.println("The root is: " + root1);
			} else {
				System.out.println("The roots are: " + root1 + " and " + root2);
			}
		}
	}
}
