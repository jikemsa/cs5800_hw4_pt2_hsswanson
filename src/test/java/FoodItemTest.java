import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodItemTest {

    private final FoodItem myHamburger = new Hamburger();
    @Test
    void getName() {
        assertEquals("Hamburger", myHamburger.getName());
    }

    @Test
    void getCost() {
        assertEquals(8.00,myHamburger.getCost());
    }

    @Test
    void testToString() {
        assertEquals(myHamburger.getName()+":"+myHamburger.getCost(), myHamburger.toString());
    }
}