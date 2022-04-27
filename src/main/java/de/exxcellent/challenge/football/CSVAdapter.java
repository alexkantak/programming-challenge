package de.exxcellent.challenge.football;

import de.exxcellent.challenge.reader.CSVReader;
import de.exxcellent.challenge.weather.Day;

import java.util.ArrayList;
import java.util.List;

public class CSVAdapter implements FootballAdapter {

	private Team createTeam(List<String> teamData) {
		String name = teamData.get(0);
		int goals = Integer.parseInt(teamData.get(5));
		int goalsAllowed = Integer.parseInt(teamData.get(6));
		return new Team(name, goals, goalsAllowed);
	}

	public List<Team> getTeams() {
		String resourcePath = "src/main/resources/de/exxcellent/challenge/";
		String fileName = "football.csv";
		CSVReader reader = new CSVReader(resourcePath);
		List<List<String>> footballData = reader.readFile(fileName);
		footballData.remove(0);
		List<Team> teams = new ArrayList<>();
		for (List<String> teamData : footballData) {
			teams.add(createTeam(teamData));
		}
		return teams;
	}
}
