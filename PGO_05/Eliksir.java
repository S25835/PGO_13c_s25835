package PGO_05;

import java.util.ArrayList;
import java.util.List;

public class Eliksir {
    private String name;
    private boolean isCreated;
    private int power;
    List<Ingredient> ingredients;
    private Liquid catalyst;

    public Eliksir(String name, Liquid catalyst) {
        this.name = name;
        this.isCreated = false;
        ingredients = new ArrayList<>();
        this.catalyst = catalyst;
    }

    public void addIngredient(Ingredient ingredient) {
        if(!isCreated) {
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

    public boolean isCreated() {
        return isCreated;
    }

    public int getPower() {
        if(isCreated)
            return power;
        throw new Error("Elixir not ready, don't have power yet.");
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public Liquid getCatalyst() {
        return catalyst;
    }

    public void create() {
        isCreated = true;
        System.out.println(ingredients.stream().reduce(0,(subtotal, element) -> subtotal + element.getBaseReagent(), Integer::sum));
        System.out.println(catalyst.getReagent());
        power = ingredients.stream().reduce(0,(subtotal, element) -> subtotal + element.getBaseReagent(), Integer::sum) / catalyst.getReagent();
    }

}
