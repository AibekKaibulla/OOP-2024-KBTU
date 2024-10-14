package lab1;


public class DragonLaunchTest {
	public static void main(String[] args) {
		DragonLaunch dragonLaunch = new DragonLaunch();
		
		dragonLaunch.kidnap(new Person(Gender.BOY));
		dragonLaunch.kidnap(new Person(Gender.BOY));
		dragonLaunch.kidnap(new Person(Gender.GIRL));
		dragonLaunch.kidnap(new Person(Gender.GIRL));
		
		dragonLaunch.printLine();
        System.out.println("Will dragon eat? " + dragonLaunch.willDragonEatOrNot());
        
        DragonLaunch dragonLaunch2 = new DragonLaunch();
        dragonLaunch2.kidnap(new Person(Gender.GIRL));
        dragonLaunch2.kidnap(new Person(Gender.BOY));
        dragonLaunch2.kidnap(new Person(Gender.GIRL));
        dragonLaunch2.kidnap(new Person(Gender.BOY));

        dragonLaunch2.printLine();
        System.out.println("Will dragon eat? " + dragonLaunch2.willDragonEatOrNot());
	}
}
