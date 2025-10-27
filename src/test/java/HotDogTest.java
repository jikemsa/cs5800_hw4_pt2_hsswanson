import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotDogTest {

    private HotDog myHotDog = new HotDog();
    @Test
    void getName() {
        String name = myHotDog.getName();
        assertEquals("Hot Dog",name);
    }

    @Test
    void getCost() {
        double cost = myHotDog.getCost();
        assertEquals(5.00, cost);
    }
}