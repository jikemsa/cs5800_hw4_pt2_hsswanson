public abstract class FoodItem {
    public abstract String getName();
    public abstract double getCost();
    private String name;
    private double cost;

    @Override
    public String toString() {
        return getName() +":" + getCost();
    }
}
