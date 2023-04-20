package HomeWork_6;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine  {
    private List<Product> products= new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName() == name) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByCost(Integer cost) {
        for (Product product : products) {
            if (product.getCost() == cost) {
                return product;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        products.add(product);
    }


}
