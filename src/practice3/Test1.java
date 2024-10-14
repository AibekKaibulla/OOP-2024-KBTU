package practice3;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<Animal> group = new ArrayList<Animal>();
		group.add(new Dog("Bella"));
		group.add(new Cat("Lily"));
		
		for (Animal a : group) {
			System.out.println(a.sleep());
		}
		
	}

}
