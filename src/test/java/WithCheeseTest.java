import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithCheeseTest {

    private final FoodItem myHamburger = new Hamburger();
    private final FoodItem cheeseBurger = new WithCheese(myHamburger);
    @Test
    void getName() {
        assertEquals(myHamburger.getName()+"+cheese",cheeseBurger.getName());
    }

    @Test
    void getCost() {
        double cost = .5+myHamburger.getCost();
        assertEquals(cost,cheeseBurger.getCost());
    }
}