package PGO_05;

public class Ingredient {
    private String name;
    private int baseReagent;

    public Ingredient(String name, int baseReagent) {
        this.name = name;
        this.baseReagent = baseReagent;
    }

    public String getName() {
        return name;
    }

    public int getBaseReagent() {
        return baseReagent;
    }

    public int getReagent() {
        return baseReagent;
    }
}
