package Practise1;

import java.util.List;

public class HotDrinkMachine implements VendingMachine {

    @Override
    public void getProduct(List<HotDrink> list, String name, double cost, int temperature) {
        for (HotDrink drink : list) {
            if (drink.getName().equals(name) && drink.getCost() == cost && drink.getTemperature()==temperature) {
                System.out.println(drink);
    }
}}}