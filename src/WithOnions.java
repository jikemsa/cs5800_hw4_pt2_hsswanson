public class WithOnions extends FoodDecorator{
    public WithOnions(FoodItem fooditem) {
        super(fooditem);
    }
    public String getName(){
        return foodItem.getName()+"+onions";
    }
    public double getCost(){
        return foodItem.getCost()+1.00;
    }
}
