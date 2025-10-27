public class WithOnions extends FoodDecorator{
    public WithOnions(FoodItem fooditem) {
        super(fooditem);
        setCostModifier(0.50);
        setNameModifier("+onions");
    }
}
