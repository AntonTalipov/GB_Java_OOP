package Practise4Second.HW4;

public class HotCoffee extends Product{
    private String brand;
    private int temperature;

    public HotCoffee(String brand, int temperature) {
        this.brand = brand;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotCoffee{" +
                "brand='" + brand + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
