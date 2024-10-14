package practice3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		Set<Person> persons = new HashSet<>();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add a new person");
			System.out.println("2. Print all info");
			System.out.println("3. Quit");
			
			int option = scanner.nextInt();
			scanner.nextLine();
			
			if (option == 1) {
				System.out.println("Enter a type of person (person, student, staff)");
				String type = scanner.nextLine();
				
				System.out.println("Enter name: ");
				String name = scanner.nextLine();
				
				System.out.println("Enter address: ");
				String address = scanner.nextLine();
				
				if (type.equals("person")) {
					persons.add(new Person(name, address));
					System.out.println("Person added");
					
				} else if (type.equals("student")) {
					System.out.println("Enter program: ");
					String program = scanner.nextLine();
					
					System.out.println("Enter year: ");
					int year = scanner.nextInt();
					
					System.out.println("Enter fee: ");
					double fee = scanner.nextDouble();
					scanner.nextLine();
					
					persons.add(new Student(name, address, program, year, fee));
					System.out.println("Student added.");
				} else if (type.equals("staff")) {
					System.out.println("Enter school: ");
					String school = scanner.nextLine();
					
					System.out.println("Enter pay: ");
					double pay = scanner.nextDouble();
					scanner.nextLine();
					
					persons.add(new Staff(name, address, school, pay));
					System.out.println("Staff added.");
				}
			} else if (option == 2) {
				if (persons.isEmpty()) {
					System.out.println("Empty. Add a person");
				} else {
					for (Person person : persons) {
						System.out.println(person);
					}
				}
			} else if (option == 3) {
				break;
			} else {
				System.out.println("Invalid option! Try again.");
			}
		}
		
	scanner.close();
	}
}
