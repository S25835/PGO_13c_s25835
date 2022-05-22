package PGO_03;

import java.util.List;
import java.util.ArrayList;

public class Person {

    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    private ShoppingCart currentCart;
    private final List<ShoppingCart> historyCart = new ArrayList<>();

    public Person(String name, String surname, double moneyInCash, double moneyOnCard) {

        setName(name);
        setSurname(surname);
        setMoneyInCash(moneyInCash);
        setMoneyOnCard(moneyOnCard);

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new RuntimeException("Surname cannot be empty");
        }
        this.surname = surname;
    }

    public double getMoneyInCash() {
        return moneyInCash;
    }

    public void setMoneyInCash(double moneyInCash) {
        if (moneyInCash < 0) {
            throw new RuntimeException("Money in cash cannot be under 0");
        }
        this.moneyInCash = moneyInCash;
    }

    public double getMoneyOnCard() {
        return moneyOnCard;
    }

    public void setMoneyOnCard(double moneyOnCard) {
        if (moneyOnCard < 0) {
            throw new RuntimeException("Money on card cannot be under 0");
        }
        this.moneyOnCard = moneyOnCard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", moneyInCash=" + moneyInCash +
                ", moneyOnCard=" + moneyOnCard +
                ", currentCart=" + currentCart +
                ", historyCart=" + historyCart +
                '}';
    }

    public void MakeOrder() {
        if (this.currentCart != null) {
            throw new RuntimeException("You already have an item in your shopping cart");
        }
        this.currentCart = new ShoppingCart();
    }

    public void BuyByCard() {
        if (currentCart == null) {
            throw new RuntimeException("You have nothing in your cart");
        }

            if (moneyOnCard < this.currentCart.totalPrice()) {
                throw new RuntimeException("You do not have enough money on card");
            }
            moneyOnCard = this.moneyOnCard - this.currentCart.totalPrice();
            this.currentCart.sell();
            this.historyCart.add(this.currentCart);
        }


    public void BuyByCash() {
        if (currentCart == null) {
            throw new RuntimeException("You have nothing in your cart");
        }
            if (moneyInCash < this.currentCart.totalPrice()) {
                throw new RuntimeException("You do not have enough money in cash");

            }
            moneyInCash = this.moneyInCash - this.currentCart.totalPrice();
            this.currentCart.sell();
            this.historyCart.add(this.currentCart);
            }

    public void addToCart(Products product) {
        if (this.currentCart == null) {
            throw new RuntimeException("No active cart");
        }
        this.currentCart.getProducts().add(product);
        }

    }

}