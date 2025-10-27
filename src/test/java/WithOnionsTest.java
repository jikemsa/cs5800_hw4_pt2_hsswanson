import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithOnionsTest {

    private final FoodItem myHamburger = new Hamburger();
    private final FoodItem onionBurger = new WithOnions(myHamburger);
    @Test
    void getName() {
        assertEquals(myHamburger.getName()+"+onions",onionBurger.getName());
    }

    @Test
    void getCost() {
        assertEquals(myHamburger.getCost()+1.00,onionBurger.getCost());
    }
}