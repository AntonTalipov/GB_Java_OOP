package Practise4Second.HW4;

public class HotTea extends Product{
    private String brand;
    private int temperature;

    public HotTea(String brand, int temperature) {
        this.brand = brand;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotTea{" +
                "brand='" + brand + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
