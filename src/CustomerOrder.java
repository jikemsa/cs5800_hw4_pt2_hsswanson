import java.util.ArrayList;


public class CustomerOrder {
    private ArrayList<FoodItem> orderItems;
    public String getItems(){
        String items = "";
        for(FoodItem item :orderItems){
            items = items +"/"+item.getName();
        }
        return items;
    }
    public double getCost(){
        double cost = 0.00;
        for(FoodItem item: orderItems){
            cost = cost + item.getCost();
        }
        return cost;
    }

    public void addItem(FoodItem item){
        orderItems.add(item);
    }
    @Override
    public String toString() {
        return "CustomerOrder{" +
                "orderItems=" + orderItems +
                "}Total Cost:"+getCost();
    }
    public CustomerOrder(){
        orderItems = new ArrayList<FoodItem>();
    }
}
