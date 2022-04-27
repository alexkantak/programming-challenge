package de.exxcellent.challenge.football;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FootballHandlerTest {
	Team team1 = new Team("Team1", 2, 1);
	Team team2 = new Team("Team2", 2, 2);
	Team team3 = new Team("Team3", 6, 9);
	List<Team> teams = Arrays.asList(team1, team2, team3);
	FootballHandler footballHandler = new FootballHandler(teams);

	@Test
	void getDayWithSmallestTempSpread() {
		assertEquals("Team2", footballHandler.getTeamWithSmallestGoalSpread().getName());
	}
}