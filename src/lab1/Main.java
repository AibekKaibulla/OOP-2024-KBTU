package lab1;



public class Main {

	public static void main(String[] args) {
		Vehicle car1 = new Vehicle(VehicleType.CAR, "ABC123", 2020);
        car1.accelerate(50);
        car1.accelerate(0.2);
        car1.displayInfo();

        Vehicle truck1 = new Vehicle(VehicleType.TRUCK, 2018);
        truck1.accelerate(30);
        truck1.displayInfo();

        System.out.println("Total vehicles created: " + Vehicle.getTotalVehicles());
	}

}