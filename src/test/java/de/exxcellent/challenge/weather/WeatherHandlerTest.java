package de.exxcellent.challenge.weather;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WeatherHandlerTest {
	Day day1 = new Day(1, 2, 1);
	Day day2 = new Day(2, 2, 2);
	Day day3 = new Day(3, 6, 3);
	List<Day> days = Arrays.asList(day1, day2, day3);
	WeatherHandler weatherHandler = new WeatherHandler(days);

	@Test
	void getDayWithSmallestTempSpread() {
		assertEquals(2, weatherHandler.getDayWithSmallestTempSpread().getDayNumber());
	}
}