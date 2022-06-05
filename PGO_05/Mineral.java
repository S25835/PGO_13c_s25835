package PGO_05;

public class Mineral extends Ingredient {
    private int power;

    public Mineral(String name, int baseReagent, int power) {
        super(name, baseReagent);
        setPower(power);
    }
    public Mineral(String name, int baseReagent) {
        super(name,baseReagent);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int getReagent() {
        return super.getReagent() + power;
    }


}
