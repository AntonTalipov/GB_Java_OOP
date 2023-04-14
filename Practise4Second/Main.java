package Practise4Second;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        VendingMachine wm1 = new VendingMachine<>();
//        wm1.addProducts(new Chips(1, "Cheese"));
//        wm1.addProducts(new Coffee("Nestle",3));
//        wm1.addProducts(new BottleOfWater("Spring", 2));
//        wm1.addProducts(new Coffee("Maxim", 3));
//        wm1.addProducts(new Chips(2, "Green onion"));
          Coffee co1 = new Coffee("Nestle",3);
          Chips ch1 = new Chips(1, "Cheese");
          BottleOfWater bw1 = new BottleOfWater("Spring", 2);
          wm1.addProducts(co1);
          wm1.addProducts(ch1);
          wm1.addProducts(bw1);
        System.out.println();
          wm1.getInfo();
          wm1.removeProduct(ch1);
          wm1.getInfo();



}}
