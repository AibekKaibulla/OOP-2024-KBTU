package practice2;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	/*hour (0-23), minute (0-59), second (0-59)*/
	public Time(int hour, int minute, int second) {
		validateTime(hour, minute, second);
	}
	
	public void validateTime(int hour, int minute, int second) {
		if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
			throw new IllegalArgumentException("Invalid time parameters");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String toUniversal() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toStandard() {
		int standardHour;
		String amPM;
		
		if (hour < 12) {
			amPM = "AM";
		} else {
			amPM = "PM";
		}
		
		if (hour == 0) {
			standardHour = 12;
		} else if (hour == 12) {
			standardHour = 12;
		} else {
			standardHour = hour % 12;
		}
		
		return String.format("%02d:%02d:%02d%s", standardHour, minute, second, amPM);
	}
	
	public Time add(Time newTime) {
		int totalSecond = this.second + newTime.second;
		int totalMinute = this.minute + newTime.minute + (totalSecond/60);
		int totalHour = this.hour + newTime.hour + (totalMinute / 60);
		
		totalSecond %= 60;
		totalMinute %= 60;
		totalHour %= 24;
		
		return new Time(totalHour, totalMinute, totalSecond);
				
		
	}
}
