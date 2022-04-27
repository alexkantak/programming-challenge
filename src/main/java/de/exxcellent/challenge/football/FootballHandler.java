package de.exxcellent.challenge.football;

import de.exxcellent.challenge.weather.Day;

import java.util.List;

public class FootballHandler {
	private final List<Team> teams;


	public FootballHandler(List<Team> teams) {
		this.teams = teams;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public Team getTeamWithSmallestGoalSpread() {
		Team teamWithSmallestGoalSpread = teams.get(0);
		for (Team team : teams) {
			if (team.getGoalSpread() < teamWithSmallestGoalSpread.getGoalSpread()) teamWithSmallestGoalSpread = team;
		}
		return teamWithSmallestGoalSpread;
	}
}
