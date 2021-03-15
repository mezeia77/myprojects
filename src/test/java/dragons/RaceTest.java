package dragons;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class RaceTest {

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

        Race race = new Race("VB", LocalDate.of(2022, 05, 22), new Boat("Csepel", BoatSize.SMALL), List.of(teamManager));

        assertEquals(1, race.getTeamManagers().size());
        assertEquals(10, race.getBoat().getSize().getNumberOfPerson());
        assertEquals(2, race.getTeamManagers().get(0).getTeams().size());
        System.out.println(race);
    }

}