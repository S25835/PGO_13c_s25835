package PGO_05;

public class Mineral extends Ingredient {
    private int power;

    public Mineral(String name, int baseReagent, int power) {
        super(name, baseReagent);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public int getReagent() {
        return super.getReagent() + power;
    }


}
