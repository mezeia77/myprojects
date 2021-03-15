package dragons;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeamManagerTest {

    @Test
    void createTest(){
        List<TeamMember> tataDragons = List.of(
                new TeamMember("Kispapa", 44, Gender.MALE),
                new TeamMember("Jony", 32, Gender.MALE),
                new TeamMember("Aranka", 52, Gender.FEMALE)
        );
        Team team = new Team("Tata Dragons", "Tata", tataDragons);

        List<TeamMember> gyoriSarkanyok = List.of(
                new TeamMember("Jollopukki", 122, Gender.MALE),
                new TeamMember("Tingli-tangli", 22, Gender.MALE),
                new TeamMember("Strong Woman", 32, Gender.FEMALE));
        Team team2 = new Team("Győri Sárkányok", "Győr", gyoriSarkanyok);

        TeamManager teamManager = new TeamManager(List.of(team, team2));

        assertEquals(2, teamManager.getTeams().size());
        assertEquals("Tata", teamManager.getTeams().get(0).getCity());
        assertEquals("Győri Sárkányok", teamManager.getTeams().get(1).getTeamName());
    }

}