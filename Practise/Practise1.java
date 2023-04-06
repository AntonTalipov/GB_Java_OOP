package Practise;

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

}

}
