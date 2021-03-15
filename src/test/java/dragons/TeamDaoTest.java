package dragons;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeamDaoTest {

    @Test
    void teamDaoTest(){
        List<TeamMember> teamMembers = List.of(
                new TeamMember("Kispapa", 44, Gender.MALE),
                new TeamMember("Jony", 32, Gender.MALE),
                new TeamMember("Aranka", 52, Gender.FEMALE)
        );


        TeamDao teamDao = new TeamDao();
        teamDao.createConnection();

        Flyway flyway = Flyway.configure().dataSource(teamDao.dataSource).load();
        flyway.clean();
        flyway.migrate();

        for (TeamMember teamMember:teamMembers){
            teamDao.writeToDb(teamMember);
        }

        assertEquals(List.of("Jony", "Kispapa", "Aranka"), teamDao.readNamesFromDbOrderedByAge());
    }

}