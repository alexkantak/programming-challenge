package de.exxcellent.challenge.weather;

import java.util.List;

public class WeatherHandler {
	private final List<Day> dayWeatherData;

	public WeatherHandler(List<Day> dayWeatherData) {
		this.dayWeatherData = dayWeatherData;
	}

	public List<Day> getDays() {
		return dayWeatherData;
	}

	public Day getDayWithSmallestTempSpread() {
		Day dayWithLowestTempSpread = dayWeatherData.get(0);
		for (Day day : this.dayWeatherData) {
			if (day.getTempSpread() < dayWithLowestTempSpread.getTempSpread()) dayWithLowestTempSpread = day;
		}
		return dayWithLowestTempSpread;
	}
}
