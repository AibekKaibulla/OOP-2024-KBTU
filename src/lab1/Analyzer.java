package lab1;
import java.util.Scanner;

public class Analyzer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Data data = new Data();
		
		while(true) {
			System.out.print("Enter number (Q to quit): ");
			String input = scanner.nextLine();
			
			if (input.equals("Q")){
				break;
			}
			
			try {
				double value = Double.parseDouble(input);
				data.addValue(value);
			} catch (NumberFormatException e) {
				System.out.println("Invalid value. Please input a numer or Q to quit.");
			}
		}
		
		System.out.printf("Average = %.1f Maximum = %.1f%n", data.getAverage(), data.getLargest());
		scanner.close();
	}

}