package practice2;

public class Tester {

	public static void main(String[] args) {
		
//		Student student = new Student("Bob", 12345);
//		System.out.println("Name: " + student.getName());
//		System.out.println("ID: " + student.getId());
//		System.out.println("Year: " + student.getYearOfStudy());
//		
		
//		StarTriangle small = new StarTriangle(3);
//        System.out.println("Small triangle (width 3):");
//        System.out.println(small.toString());
//
//        System.out.println("\nLarger triangle (width 5):");
//        StarTriangle larger = new StarTriangle(5);
//        System.out.println(larger.toString());
		
		Time t1 = new Time(23, 5, 6);
        Time t2 = new Time(4, 24, 33);

        // Displaying both times in Universal and Standard formats
        System.out.println("t1 Universal: " + t1.toUniversal());   
        System.out.println("t1 Standard: " + t1.toStandard());     

        System.out.println("t2 Universal: " + t2.toUniversal());   
        System.out.println("t2 Standard: " + t2.toStandard());     

       
        Time t3 = t1.add(t2);
        System.out.println("t1 + t2 Universal: " + t3.toUniversal());  
        System.out.println("t1 + t2 Standard: " + t3.toStandard());    
	}

}
