package de.exxcellent.challenge.weather;

import java.util.Objects;

public class Day {
	private final int dayNumber;
	private final int maxTemp;
	private final int minTemp;

	public Day(int dayNumber, int maxTemp, int minTemp) {
		this.dayNumber = dayNumber;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
	}

	public int getDayNumber() {
		return dayNumber;
	}

	public int getMaxTemp() {
		return maxTemp;
	}

	public int getMinTemp() {
		return minTemp;
	}

	public int getTempSpread() {
		return maxTemp - minTemp;
	}
}
