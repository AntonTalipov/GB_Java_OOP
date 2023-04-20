package HomeWork_6;

public class FindProduct extends VendingMachine {
    Product product;
    public Product getProductByName(String name) {
        for (Product product :getProducts() ) {
            if (product.getName() == name) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByCost(Integer cost) {
        for (Product product : getProducts()) {
            if (product.getCost() == cost) {
                return product;
            }
        }
        return null;
    }
}
