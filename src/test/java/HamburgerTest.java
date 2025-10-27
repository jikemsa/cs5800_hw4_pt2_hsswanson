import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburgerTest {

    private Hamburger myHamburger = new Hamburger();
    @Test
    void getName() {
        String name = myHamburger.getName();
        assertEquals("Hamburger",name);
    }

    @Test
    void getCost() {
        double cost = myHamburger.getCost();
        assertEquals(8.00,cost);
    }
}