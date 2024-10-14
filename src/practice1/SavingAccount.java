package practice1;
import java.util.Scanner;

public class SavingAccount {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter initial balance: ");
		double initialBalance = scanner.nextDouble();
		
		System.out.println("Enter interest rate: ");
		double interestRate = scanner.nextDouble();
		
		System.out.println("Initial balance: $" + initialBalance);
		
		double interest = calculateInterest(initialBalance, interestRate);
		
		double newBalance = initialBalance + interest;
		
		System.out.println("New Balance after adding interest: $" + newBalance);

	}
	public static double calculateInterest(double balance, double rate) {
		return balance * (rate / 100);
	}
}
