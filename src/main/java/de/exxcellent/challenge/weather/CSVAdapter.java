package de.exxcellent.challenge.weather;

import de.exxcellent.challenge.reader.CSVReader;

import java.util.ArrayList;
import java.util.List;

public class CSVAdapter implements WeatherAdapter {

	private Day createDay(List<String> dayData) {
		int dayIndex = Integer.parseInt(dayData.get(0));
		int maxTemp = Integer.parseInt(dayData.get(1));
		int minTemp = Integer.parseInt(dayData.get(2));
		return new Day(dayIndex, maxTemp, minTemp);
	}

	public List<Day> getDays() {
		String resourcePath = "src/main/resources/de/exxcellent/challenge/";
		String fileName = "weather.csv";
		CSVReader reader = new CSVReader(resourcePath);
		List<List<String>> weatherData = reader.readFile(fileName);
		weatherData.remove(0);
		List<Day> days = new ArrayList<>();
		for (List<String> dayData : weatherData) {
			days.add(createDay(dayData));
		}
		return days;
	}
}
