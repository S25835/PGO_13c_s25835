package PGO_05;

public class Liquid extends Ingredient {
    private int dissolubility;
    public Liquid(String name, int baseReagent, int dissolubility) {
        super(name, baseReagent);
        this.dissolubility = dissolubility;
    }

    @Override
    public int getReagent() {
        return dissolubility;
    }

    public int getDissolubility() {
        return dissolubility;
    }

}
