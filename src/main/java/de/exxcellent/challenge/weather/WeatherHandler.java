package de.exxcellent.challenge.weather;

import java.util.List;

public class WeatherHandler {
	private final List<Day> days;

	public WeatherHandler(List<Day> days) {
		this.days = days;
	}

	public List<Day> getDays() {
		return days;
	}

	public Day getDayWithSmallestTempSpread() {
		Day dayWithLowestTempSpread = days.get(0);
		for (Day day : this.days) {
			if (day.getTempSpread() < dayWithLowestTempSpread.getTempSpread()) dayWithLowestTempSpread = day;
		}
		return dayWithLowestTempSpread;
	}
}
