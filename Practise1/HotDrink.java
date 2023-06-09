package Practise1;

public class HotDrink extends Product {

    private int temperature;


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public HotDrink(String name, int cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "This is "+getName()+" with cost "+getCost()+ " and temperature "+temperature;
    }
}
