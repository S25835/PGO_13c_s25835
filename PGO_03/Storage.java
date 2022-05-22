package PGO_03;

import java.util.ArrayList;

public class Storage {
    private int deliveryTime;
    private ArrayList<Products> products = new ArrayList<>();

    public Storage(int deliveryTime) {
        setDeliveryTime(deliveryTime);
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        if (deliveryTime < 0) {
            throw new RuntimeException("Delivery time cannot be under 0");
        }
        this.deliveryTime = deliveryTime;
    }

}
