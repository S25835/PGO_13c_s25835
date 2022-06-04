package PGO_05;

public class Ore extends Mineral {
    private boolean metallic;

    public Ore(String name, int baseReagent, int power, boolean metallic) {
        super(name, baseReagent, power);
        this.metallic = metallic;
    }

    public boolean isMetallic() {
        return metallic;
    }

    @Override
    public int getReagent() {
        return metallic ? super.getReagent() : super.getReagent() / 2;
    }
}
