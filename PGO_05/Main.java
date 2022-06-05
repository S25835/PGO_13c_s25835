package PGO_05;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Eliksir eliksir = new Eliksir("Chad");
        Liquid catalyst2 = new Alcohol("Methanol",10,20,80);

        Ingredient iron = new Ore("Iron", 100, 100, true);
        Ingredient daisy = new Flower("Daisy", 20, 5);
        Ingredient ethanol = new Alcohol("Ethanol", 12, 35, 80);
        Ingredient ginger = new Root("Ginger", 25, 10);

        eliksir.addIngredient(iron);
        eliksir.addIngredient(daisy);
        eliksir.addIngredient(ethanol);
        eliksir.removeIngredient(ethanol);
        eliksir.addIngredient(ginger);
        eliksir.setCatalyst(catalyst2);
        eliksir.create();

        System.out.println(eliksir.getPower());
        System.out.println(eliksir);


        }
    }

