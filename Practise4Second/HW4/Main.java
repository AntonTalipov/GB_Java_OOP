package Practise4Second.HW4;

//Необходимо взять код из первого дз и переработать его с учетом обобщений т.е избавиться от
//        классов под каждый тип продукта, заменив единым классом - торговым автоматом
public class Main {
    public static void main(String[] args) {
        VendingMachine<Product> vm1 = new VendingMachine<>();
        vm1.addProducts(new BottleOfWater("Spring water", 17));
        vm1.addProducts(new HotCoffee("Maxim", 48));
        vm1.addProducts(new HotTea("Nestea", 54));
        vm1.showInfo();
    }
}
