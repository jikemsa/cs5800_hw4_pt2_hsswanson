public abstract class FoodDecorator {
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
        String name = foodItem.getName();
        name = name + getNameModifier();
        return name;
    }

    public double getCost(){
        double cost = foodItem.getCost();
        cost = cost + getCostModifier();
        return cost;
    }

    public FoodDecorator(FoodItem fooditem){
        this.foodItem = fooditem;
    }
}
