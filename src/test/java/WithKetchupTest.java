import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithKetchupTest {

    private final FoodItem myHamburger = new Hamburger();
    private final FoodItem hamburger2 = new WithKetchup(myHamburger);
    @Test
    void getName() {
        assertEquals(myHamburger.getName()+"+ketchup",hamburger2.getName());
    }

    @Test
    void getCost() {
        assertEquals(myHamburger.getCost()+0.05,hamburger2.getCost());
    }
}