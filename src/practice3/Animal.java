package practice3;

public abstract class Animal {
	String name;
	
	Animal(String name) {
		this.name = name;
	}
	
	abstract String makeNoise();
	
	String sleep() {
		return name + " is sleeping...";
	}
}

class Cat extends Animal {
	
	Cat(String name) {
		super(name);
	}
	
	@Override
	String makeNoise () {
		return "Meow";
	}
	
	// Overloaded method
	String makeNoise(String mood) {
		if (mood.equals("happy")) {
			return "Purr";
		} else {
			return "Hiss";
		}
	}
	
	@Override
	String sleep() {
		return super.sleep() + " Cat sleeps softly.";
	}
}

class Dog extends Animal {
	
	Dog(String name) {
		super(name);
	}
	
	@Override
	String makeNoise() {
		return "Bark";
	}
	
	//Overloading	
	String makeNoise(String mood) {
		if (mood.equals("angry")) {
			return "Growl";
		} else {
			return "Woof";
		}
	}
	
	@Override
	String sleep() {
		return super.sleep() + " Dog sleeps loudly.";
	}
}

