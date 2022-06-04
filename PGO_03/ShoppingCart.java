package PGO_03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class ShoppingCart {
    private static long idCount=0;
    private long ID=idCount++;
    private ArrayList<Products> products = new ArrayList<>();


    public double totalPrice() {
        double price = 0;
        for (Products product : this.products) {
            price += product.getPrice();
        }
        return price;
    }

    public int totalDeliveryTime() {
        int deliveryTime = 0;
        Set<Storage> chosenStorages = new HashSet<>();
        for (Products products : this.products) {
            if (products.getStorage() != null) {
                chosenStorages.add(products.getStorage());
            }
        }
        for (Storage storage : chosenStorages) {
            deliveryTime += storage.getDeliveryTime();
        }
        return deliveryTime;
    }

    public ArrayList<Products> getProducts() {
        return products;
    }

    public void sell() {
        for (Products product : this.products) {
            product.sell();
        }
    }
    public long getId() {
        return ID;
    }
}






