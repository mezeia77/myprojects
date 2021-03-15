package dragons;

import java.util.List;

public class Team {
    private String teamName;
    private String city;
    List<TeamMember> teamMembers;

    public Team(String teamName, String city, List<TeamMember> teamMembers) {
        this.teamName = teamName;
        this.city = city;
        this.teamMembers = teamMembers;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getCity() {
        return city;
    }

    public List<TeamMember> getTeamMembers() {
        return teamMembers;
    }

    public void addTeamMember(TeamMember teamMember){
        teamMembers.add(teamMember);
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", city='" + city + '\'' +
                ", teamMembers=" + teamMembers +
                '}';
    }
}
