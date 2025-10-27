import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class LoyalCustomerTest {

    private final CustomerOrder order = new CustomerOrder(new ArrayList<FoodItem>(Arrays.asList(new HotDog(), new Hamburger())));
    private final CustomerOrder loyalOrder = new LoyalCustomer(order);



    @Test
    void getCost() {
        assertEquals(.9*order.getCost(),loyalOrder.getCost());
    }

    @Test
    void getItems() {
        assertEquals(order.getItems(),loyalOrder.getItems());
    }
}