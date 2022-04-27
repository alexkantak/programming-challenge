package de.exxcellent.challenge.reader;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Example JUnit 5 test case.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
class CSVReaderTest {

	private final CSVReader reader = new CSVReader("src/main/resources/de/exxcellent/challenge/");
	private final List<List<String>> weatherData = reader.readFile("weather.csv");

	@Test
	void testHeaderData() {
		List<String> headerTestData = Arrays.asList("Day", "MxT", "MnT", "AvT", "AvDP", "1HrP TPcpn", "PDir", "AvSp", "Dir", "MxS", "SkyC", "MxR", "Mn", "R AvSLP");
		assertEquals(headerTestData, weatherData.get(0));
	}

	@Test
	void testFirstRowData() {
		List<String> rowTestData = Arrays.asList("1", "88", "59", "74", "53.8", "0", "280", "9.6", "270", "17", "1.6", "93", "23", "1004.5");
		assertEquals(rowTestData, weatherData.get(1));
	}

	@Test
	void testDataLength() {
		assertEquals(31, weatherData.size());
	}

}