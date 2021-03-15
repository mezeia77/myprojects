package dragons;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    @Test
    void createTest(){
        List<TeamMember> teamMembers = List.of(
                new TeamMember("Kispapa", 44, Gender.MALE),
                new TeamMember("Jony", 32, Gender.MALE),
                new TeamMember("Aranka", 52, Gender.FEMALE)
        );
        Team team = new Team("Tata Dragons", "Tata", teamMembers);

        assertEquals("Tata Dragons", team.getTeamName());
        assertEquals("Tata", team.getCity());
        assertEquals(3, team.getTeamMembers().size());
        assertEquals(52, team.getTeamMembers().get(2).getAge());
    }

}