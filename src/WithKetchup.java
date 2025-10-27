public class WithKetchup extends FoodDecorator{
    public WithKetchup(FoodItem fooditem) {
        super(fooditem);
        setCostModifier(0.05);
        setNameModifier("+ketchup");
    }
}
