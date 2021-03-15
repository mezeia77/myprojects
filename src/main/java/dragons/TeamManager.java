package dragons;

import java.util.ArrayList;
import java.util.List;

public class TeamManager {

    List<Team> teams = new ArrayList<>();

    public TeamManager(List<Team> teams) {
        this.teams = teams;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void addTeam(Team team){
        teams.add(team);
    }

    @Override
    public String toString() {
        return "TeamManager{" +
                "teams=" + teams +
                '}';
    }
}
