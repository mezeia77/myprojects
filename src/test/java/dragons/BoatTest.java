package dragons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoatTest {
    Boat boat;
    Boat boat2;
    Boat boat3;

    @BeforeEach
    void init() {
        boat = new Boat("Shanghai", BoatSize.SMALL);
        boat2 = new Boat("Shanghai", BoatSize.LARGE);
        boat3 = new Boat("VDA", BoatSize.LARGE);

        boat.addList(boat);
        boat.addList(boat2);
        boat.addList(boat3);
    }

    @Test
    void createTest(){
        assertEquals("Shanghai", boat.getManufacturer());
        assertEquals(BoatSize.LARGE, boat3.getSize());
        assertEquals(3, boat.getBoats().size());
    }

}