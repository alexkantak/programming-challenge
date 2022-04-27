package de.exxcellent.challenge.football;

public class Team {
	private final String name;
	private final int goals;
	private final int goalsAllowed;

	public Team(String name, int goals, int goalsAllowed) {
		this.name = name;
		this.goals = goals;
		this.goalsAllowed = goalsAllowed;
	}

	public String getName() {
		return name;
	}

	public int getGoals() {
		return goals;
	}

	public int getGoalsAllowed() {
		return goalsAllowed;
	}

	public int getGoalSpread() {
		return Math.abs(goals - goalsAllowed);
	}
}
