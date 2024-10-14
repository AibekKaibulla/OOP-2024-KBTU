package lab1;

public class Data {
	private double total;
	private double max;
	private int count;
	
	public Data() {
		total = 0.0;
		max = 0.0;
		count = 0;
	}
	
	public void addValue(double value) {
		total += value;
		count++;
		
		if (value > max) {
			max = value;
		}
	}
	public double getAverage() {
		if (count == 0) {
			return 0;
		}
		return total / count;
	}
	
	public double getLargest() {
		if (count == 0) {
			return 0;
		}
		return max;
	}
}