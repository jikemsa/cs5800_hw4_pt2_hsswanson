public abstract class FoodDecorator extends FoodItem {
    protected FoodItem foodItem;
    private String nameModifier;
    private double costModifier;






    public String getName(){
        return this.foodItem.getName();

    }

    public double getCost(){
        return this.foodItem.getCost();
    }

    public FoodDecorator(FoodItem fooditem){
        this.foodItem = fooditem;
    }
}
