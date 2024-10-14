package lab1;

public class Temperature {
	private double temperatureValue;
	private char scale;
	
	public Temperature(double temperatureValue) {
		this.temperatureValue = temperatureValue;
		this.scale = 'C';
	}
	public Temperature(char scale) {
		this.temperatureValue = 0;
		this.scale = scale;
	}
	
	public Temperature(double temperatureValue, char scale) {
		this.temperatureValue = temperatureValue;
		this.scale = scale;	
	}
	public Temperature() {
		this.temperatureValue = 0;
		this.scale = 'C';
	}
	
	public double getCelcius() {
		if (scale == 'C') {
			return temperatureValue;
		} else {
			return 5 * (temperatureValue - 32) / 9;
		}
	}
	
	public double getFahrenheit() {
        if (scale == 'F') {
            return temperatureValue;
        } else {
            return (9 * (temperatureValue / 5)) + 32;
        }
    }
	
	public void setTemperatureValue(double temperatureValue) {
        this.temperatureValue = temperatureValue;
    }
	
	public void setScale(char scale) {
        if (scale == 'C' || scale == 'F') {
            this.scale = scale;
        } else {
            throw new IllegalArgumentException("Scale must be 'C' or 'F'.");
        }
    }
	
	public void setTemperature(double temperatureValue, char scale) {
        this.temperatureValue = temperatureValue;
        setScale(scale); 
    }
	
	public char getScale() {
        return scale;
    }

}