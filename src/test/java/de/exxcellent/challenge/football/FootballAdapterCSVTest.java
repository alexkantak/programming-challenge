package de.exxcellent.challenge.football;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FootballAdapterCSVTest {
	FootballAdapter weatherAdapter = new FootballAdapterCSV();
	Team firstTeam = new Team("Arsenal",79,36);
	Team lastTeam = new Team("Leicester",30,64);

	@Test
	void getTeams() {
		List<Team> days = weatherAdapter.getTeams();
		assertEquals(20, days.size());
		assertEquals(firstTeam.getName(), days.get(0).getName());
		assertEquals(lastTeam.getName(), days.get(19).getName());
	}
}