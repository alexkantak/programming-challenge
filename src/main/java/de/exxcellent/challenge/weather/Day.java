package de.exxcellent.challenge.weather;

public class Day {
	private final int day;
	private final int maxTemp;
	private final int minTemp;

	public Day(int day, int maxTemp, int minTemp) {
		this.day = day;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
	}

	public int getDay() {
		return day;
	}

	public int getMaxTemp() {
		return maxTemp;
	}

	public int getMinTemp() {
		return minTemp;
	}

	public int getTempRange() {
		return maxTemp - minTemp;
	}
}
