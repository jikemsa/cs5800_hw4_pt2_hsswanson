public class WithCheese extends FoodDecorator{
    public WithCheese(FoodItem foodItem){
        super(foodItem);
    }
    public String getName(){
        return foodItem.getName()+"+cheese";
    }
    public double getCost(){
        return foodItem.getCost()+0.50;
    }
}
