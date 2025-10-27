import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerOrderTest {

    private CustomerOrder newOrder = new CustomerOrder();

    @Test
    void getItems(){
        assertEquals("",newOrder.getItems());
    }

    @Test
    void getCost(){
        assertEquals(0.00,newOrder.getCost());
    }

    @Test
    void addItem() {
        newOrder.addItem(new Hamburger());
        assertEquals("/Hamburger",newOrder.getItems());
        newOrder.addItem(new WithOnions(new HotDog()));
        assertEquals("/Hamburger/Hot Dog+onions",newOrder.getItems());
    }




    @Test
    void testToString() {
        assertEquals("CustomerOrder{orderItems=}Total Cost:0.0",newOrder.toString());
        newOrder.addItem(new Hamburger());
        assertEquals("CustomerOrder{orderItems=/Hamburger}Total Cost:8.0",newOrder.toString());
        newOrder.addItem(new WithOnions(new HotDog()));
        assertEquals("CustomerOrder{orderItems=/Hamburger/Hot Dog+onions}Total Cost:14.0",newOrder.toString());
    }
}