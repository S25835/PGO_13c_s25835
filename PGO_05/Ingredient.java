package PGO_05;

public class Ingredient {
    private String name;
    private int baseReagent;

    public Ingredient(String name, int baseReagent) {
        setName(name);
        setReagent(baseReagent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new Error("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    public int getBaseReagent() {
        return baseReagent;
    }

    public int getReagent() {
        return baseReagent;
    }

    public void setReagent(int baseReagent) {
        if (baseReagent < 0) {
            throw new Error("Value cannot be under 0");
        } else {
            this.baseReagent = baseReagent;
        }

    }
}

