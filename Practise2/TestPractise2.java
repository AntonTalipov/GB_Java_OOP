package Practise2;

public class TestPractise2 {
    public static void main(String[] args) {

        Human human1 = new Human();
        human1.setName("Anton");
        System.out.println(human1.getName());
        human1.setMakeOrder();
        System.out.println(human1.isMakeOrder());
        human1.setTakeOrder();
        System.out.println(human1.isTakeOrder);
        Market market = new Market();
        market.acceptToMarket(human1);
        market.takeQueue(human1);
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(human1);
        market.update();

    }
}