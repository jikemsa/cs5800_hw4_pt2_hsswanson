public class Hamburger extends FoodItem{
    public Hamburger(){

    }

    @Override
    public String getName() {
        return "Hamburger";
    }

    @Override
    public double getCost() {
        return 8.00;
    }
}
