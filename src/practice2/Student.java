package practice2;

public class Student {
	private String name;
    private int id;
    private int yearOfStudy;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1; 
    }

    // Method to access name
    public String getName() {
        return name;
    }

    // Method to access id
    public int getId() {
        return id;
    }

    // Method to access year of study
    public int getYearOfStudy() {
        return yearOfStudy;
    }

   
    public void incrementYear() {
        yearOfStudy++;
    }
}
