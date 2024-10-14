package lab1;
import java.util.List;

public class Course {
    private String name;
    private String description;
    private int credits;
    private List<Course> prerequisites;

    // Constructor
    public Course(String name, String description, int credits, List<Course> prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCredits() {
        return credits;
    }

    public List<Course> getPrerequisites() {
        return prerequisites;
    }

    
}
