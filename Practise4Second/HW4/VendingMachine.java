package Practise4Second.HW4;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine<T extends Product> {
    private List<T> products;

    public VendingMachine() {
        List<T> products = new ArrayList<>();
        this.products = products;
    }
    public void addProducts(T product){
        this.products.add(product);
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "products=" + products +
                '}';
    }
    public void showInfo(){
        for(Product x : products){
            System.out.println(x);
        }
    }
}
