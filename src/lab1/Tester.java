package lab1;

public class Tester {
	public static void main(String[] args) {
        Temperature temp1 = new Temperature(100.0, 'C');
        Temperature temp2 = new Temperature('F');
        Temperature temp3 = new Temperature(32.0);
        Temperature temp4 = new Temperature();
        
        System.out.println("Temperature 1 in Celsius: " + temp1.getCelcius());
        System.out.println("Temperature 1 in Fahrenheit: " + temp1.getFahrenheit());
       
        temp2.setTemperature(98.6, 'F');
        System.out.println("Temperature 2 in Celsius: " + temp2.getCelcius());
        System.out.println("Temperature 2 in Fahrenheit: " + temp2.getFahrenheit());
        
        System.out.println("Scale of temp3: " + temp3.getScale());
        System.out.println("Temperature 4 in Celsius " + temp4.getCelcius());
	}
}