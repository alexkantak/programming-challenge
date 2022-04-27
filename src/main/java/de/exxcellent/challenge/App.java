package de.exxcellent.challenge;

import de.exxcellent.challenge.weather.WeatherAdapter;
import de.exxcellent.challenge.weather.CSVAdapter;
import de.exxcellent.challenge.weather.WeatherHandler;

import java.util.Objects;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

	/**
	 * This is the main entry method of your program.
	 *
	 * @param args The CLI arguments passed
	 */
	public static void main(String... args) {

		if (args.length == 1 && Objects.equals(args[0], "weather")) {
			WeatherAdapter weatherAdapter = new CSVAdapter();
			WeatherHandler weatherHandler = new WeatherHandler(weatherAdapter.getDays());

			int dayWithSmallestTempSpread = weatherHandler.getDayWithSmallestTempSpread().getDayNumber();     // Your day analysis function call …
			System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
		}

		if (args.length == 1 && Objects.equals(args[0], "football")) {
			String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
			System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
		}
	}
}
