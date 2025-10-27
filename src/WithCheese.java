public class WithCheese extends FoodDecorator{
    public WithCheese(FoodItem foodItem){
        super(foodItem);
        setCostModifier(0.25);
        setNameModifier("+cheese");
    }
}
