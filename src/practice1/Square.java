package practice1;
import java.util.Scanner;

public class Square {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the length: ");
		double side = scanner.nextDouble();
		
		double area = calculateArea(side);
		System.out.println("Area of the square is: " + area);
		
		double perimeter = calculatePerimeter(side);
		System.out.println("Perimeter of the square is: " + perimeter);
		
		double diagonal = calculateDiagonal(side);
		System.out.println("Diagonal of the square is: " + diagonal);
		
		scanner.close();
	}
	
	public static double calculateArea(double side) {
		return side * side;
	}
	
	public static double calculatePerimeter(double side) {
		return 4 * side;
	}
	
	public static double calculateDiagonal(double side) {
		return side * Math.sqrt(2);
	}
}
