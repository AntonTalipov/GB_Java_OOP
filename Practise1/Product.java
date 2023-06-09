package Practise1;

public abstract class Product {
    private String name;
    private int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}
