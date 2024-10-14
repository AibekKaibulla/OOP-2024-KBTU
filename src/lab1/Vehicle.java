package lab1;

enum VehicleType  {
	CAR, MOTORCYCLE, TRUCK, BUS
}

public class Vehicle {
	private static int totalVehicles = 0;

	public static final int MAX_SPEED = 200;
	
	private final VehicleType type;
	
	private final String licensePlate;
	
	private final int year;
	
	private int currentSpeed;
	
	 {
	        currentSpeed = 0;
	        System.out.println("Current speed set to 0.");
    }
	
	 public Vehicle(VehicleType type, String licensePlate, int year) {
	        this.type = type;
	        this.licensePlate = licensePlate;
	        this.year = year;
	        Vehicle.totalVehicles++; 
    }
	 
	public Vehicle(VehicleType type, int year) {
		this(type, "UNKNOWN", year); // overloaded constructor
	}
	
	public String getLicensePlate() {
        return licensePlate;
    }

  
    public static int getTotalVehicles() {
        return totalVehicles;
    }
    
    public void accelerate(int increment) {
        if (currentSpeed + increment > MAX_SPEED) {
            currentSpeed = MAX_SPEED;
        } else {
            currentSpeed += increment;
        }
        System.out.println("Vehicle accelerated. Current speed: " + currentSpeed + " km/h");
    }
    
    public void accelerate(double factor) {
        int increment = (int) (currentSpeed * factor);
        accelerate(increment);
    }
    
    public final void displayInfo() {
        System.out.println("Vehicle Type: " + type);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Manufacture Year: " + year);
        System.out.println("Current Speed: " + currentSpeed);
        System.out.println("Max Speed: " + MAX_SPEED);
        System.out.println("Total Vehicles: " + totalVehicles);
    }
}