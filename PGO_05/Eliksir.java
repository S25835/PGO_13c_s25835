package PGO_05;

import java.util.ArrayList;
import java.util.List;

public class Eliksir {
    private String name;
    private boolean isCreated=false;
    private int power;
    List<Ingredient> ingredients;
    private Liquid catalyst;

    public Eliksir(String name) {
        this.name = name;
        ingredients = new ArrayList<>();
        this.catalyst = catalyst;
    }

    public void addIngredient(Ingredient ingredient) {
        if (!isCreated) {
            ingredients.add(ingredient);
        }
    }

    public void removeIngredient(Ingredient ingredient) {
        if (!isCreated) {
            ingredients.remove(ingredient);
        }
    }

    public void setCatalyst(Liquid catalyst) {
        if (!isCreated) {
            this.catalyst = catalyst;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new Error("Name cannot be empty.");
        } else {
            this.name = name;
        }
    }

    public boolean isCreated() {
        return isCreated;
    }

    public int getPower() {
        if (!isCreated) {
            throw new Error("Elixir not ready, don't have power yet.");
        } else {
            return power;
        }
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public Liquid getCatalyst() {
        return catalyst;
    }

    public void create()  {
        isCreated = true;
        for (Ingredient ingredient: ingredients) {
            power += ingredient.getReagent();
        }
        power=power/catalyst.getReagent();
    }
    }






