//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("CS5800_hw4_p2"));
    Fries myFries = new Fries();
    IO.println(myFries);
    FoodItem cheeseFries = new WithCheese(myFries);
    IO.println(cheeseFries);

}
