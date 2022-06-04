package PGO_05;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Liquid catalyst1 = new Water("Water",1,15,true);
        Eliksir eliksir = new Eliksir("Chad");

        Ingredient iron = new Ore("Iron", 100, 100, true);
        Ingredient daisy = new Flower("Daisy", 20, 5);
        Ingredient ethanol = new Alcohol("Ethanol", 12, 50, 80);

        eliksir.setCatalyst(catalyst1);
        eliksir.addIngredient(iron);
        eliksir.addIngredient(daisy);
        eliksir.addIngredient(ethanol);
        eliksir.create();

        System.out.println(eliksir.getPower());

        }
    }

