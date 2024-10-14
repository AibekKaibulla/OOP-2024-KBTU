package lab1;
import java.util.Vector;

public class DragonLaunch {
	private Vector<Person> kidnappedPeople = new Vector<>();
	
	public void kidnap(Person p) {
		kidnappedPeople.add(p);
	}
	
	public boolean willDragonEatOrNot() {
		int boyCount = 0;
		
		for (Person p : kidnappedPeople) {
			if (p.getGender() == Gender.BOY) {
				boyCount++;
			} else if (boyCount > 0) {
				boyCount--; // decrease boy count for each girl found
			}
		}
		
		return boyCount > 0;
	}
	
	public void printLine() {
		for (Person p : kidnappedPeople) {
			System.out.print(p + " ");
		}
		System.out.println();
	}
}
