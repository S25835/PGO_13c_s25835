package PGO_05;

public class Liquid extends Ingredient {
    protected int dissolubility;
    public Liquid(String name, int baseReagent, int dissolubility) {
        super(name, baseReagent);
        this.dissolubility = dissolubility;
    }

    @Override
    public int getReagent() {
        return super.getReagent() * getDissolubility() / 100;
    }

    public int getDissolubility() {
        return dissolubility;
    }

    public void setDissolubility(int dissolubility) {
        if (dissolubility > 0 || dissolubility < 100) {
            throw new Error("Must be between 0 and 100"); }
        else {
            this.dissolubility = dissolubility;
        }
    }

}
