import java.util.ArrayList;

public class LoyalCustomer extends CustomerOrder{
    protected CustomerOrder originalOrder;
    public LoyalCustomer(CustomerOrder order){
        this.originalOrder=order;
    }

    @Override
    public double getCost() {
        double cost = originalOrder.getCost();
        return cost*.90;
    }
    public String getItems(){
        return originalOrder.getItems();
    }


}
