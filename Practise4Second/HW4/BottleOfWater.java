package Practise4Second.HW4;

public class BottleOfWater extends Product {
    private String brand;
    private int temperature;

    public BottleOfWater(String brand, int temperature) {
        this.brand = brand;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "brand='" + brand + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}


