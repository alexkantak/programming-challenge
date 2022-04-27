package de.exxcellent.challenge.weather;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CSVAdapterTest {
	WeatherAdapter weatherAdapter = new CSVAdapter();
	Day firstDay = new Day(1,88,59);
	Day lastDay = new Day(30,90,45);

	@Test
	void getDays() {
		List<Day> days = weatherAdapter.getDays();
		assertEquals(30, days.size());
		assertEquals(firstDay.getDayNumber(), days.get(0).getDayNumber());
		assertEquals(lastDay.getDayNumber(), days.get(29).getDayNumber());
	}
}