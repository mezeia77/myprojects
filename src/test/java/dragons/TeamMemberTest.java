package dragons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamMemberTest {

    @Test
    void createTest(){
        TeamMember member = new TeamMember("Jollopukki", 122, Gender.MALE);
        TeamMember member2 = new TeamMember("Tingli-tangli", 22, Gender.MALE);
        TeamMember member3 = new TeamMember("Strong Woman", 32, Gender.FEMALE);

        assertEquals("Jollopukki", member.getName());
        assertEquals(22, member2.getAge());
        assertEquals(Gender.FEMALE, member3.getGender());
    }

}