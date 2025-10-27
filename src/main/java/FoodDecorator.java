public abstract class FoodDecorator extends FoodItem {
    protected FoodItem foodItem;
    private String nameModifier;
    private double costModifier;

    public String getNameModifier() {
        return nameModifier;
    }

    public void setNameModifier(String nameModifier) {
        this.nameModifier = nameModifier;
    }

    public double getCostModifier() {
        return costModifier;
    }

    public void setCostModifier(double costModifier) {
        this.costModifier = costModifier;
    }


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
