package PGO_03;

public class Products {

    private String name;
    private ProductType productType;
    private double price;
    private int quantity;
    private Storage storage;
    private boolean isAvailable;

    public Products(String name, ProductType productType, double price, int quantity, Storage storage) {
        setName(name);
        setProductType(productType);
        setPrice(price);
        setQuantity(quantity);
        setStorage(storage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Name cannot be empty");
        }

    public ProductType getProductType() {
        return productType;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Storage getStorage() {
        return storage;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

}
