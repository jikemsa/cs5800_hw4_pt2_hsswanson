import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FriesTest {

    private Fries myFries = new Fries();

    @Test
    void getName() {
        String name = myFries.getName();
        assertEquals("Fries", name);
    }

    @Test
    void getCost() {
        double cost = myFries.getCost();
        assertEquals(2.00,cost);
    }


}