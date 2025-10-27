public class WithKetchup extends FoodDecorator{
    public WithKetchup(FoodItem fooditem) {
        super(fooditem);
    }
    public String getName(){
        return foodItem.getName()+"+ketchup";
    }
    public double getCost(){
        return foodItem.getCost()+0.05;
    }
}
