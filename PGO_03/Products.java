package PGO_03;

public class Products {

    private String name;
    private ProductType productType;
    private double price;
    private int quantity;
    private boolean isAvailable;
    private Storage storage;

    public Products(String name, ProductType productType, double price, int quantity, Storage storage) {
        setName(name);
        setProductType(productType);
        setPrice(price);
        setQuantity(quantity);
        setStorage(storage);
    }

    public Products(String name, ProductType productType, double price, int quantity) {
        setName(name);
        setProductType(productType);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Name cannot be empty");
        }
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType){
            if (productType == null) {
                throw new RuntimeException("Product type cannot be empty");

            }
            this.productType = productType;
        }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("Price cannot be under 0");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new RuntimeException("Quantity cannot be under 0");
        }
        this.quantity = quantity;
    }

    public boolean isAvailable() {
        if (getQuantity() >=1) {
            return true;
        } else {
            return false;
        }

    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
}

    public void sell(){
        if (!isAvailable()) {
            throw new RuntimeException("Product is not available");
        }
        else
            quantity--;
        }

    public void increaseQuantity(int quantity){
        if (quantity<=0) {
            throw new RuntimeException("Quantity cannot be 0 and under");
            }
            this.quantity += quantity;
        }
}



