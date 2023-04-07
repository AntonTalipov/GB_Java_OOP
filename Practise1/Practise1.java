package Practise1;

import java.util.ArrayList;
import java.util.List;

public class Practise1 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        BottleOfWater bottle = new BottleOfWater("Spring", 15);
        Fanta fanta = new Fanta("Fanta orange", 35);
        Snikers snikers = new Snikers("Snikers extra size", 27);
        products.add(bottle);
        products.add(fanta);
        products.add(snikers);
        GiveBottleOfWaterMachine giveMachine = new GiveBottleOfWaterMachine();

        //HomeWork
        HotDrink tea = new HotDrink("Tea", 15, 35);
        HotDrink coffeeLatte = new HotDrink("Latte", 27, 53);
        HotDrink coffeeCappuchino = new HotDrink("Cappuchino", 31, 56);
        List<HotDrink> hotDrinks = new ArrayList<>();
        hotDrinks.add(tea);
        hotDrinks.add(coffeeCappuchino);
        hotDrinks.add(coffeeLatte);
        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine();
        hotDrinkMachine.getProduct( hotDrinks,"Tea",15,35);


}

}
