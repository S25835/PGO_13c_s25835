package PGO_05;

public class Alcohol extends Liquid {
    private int percent;

    public Alcohol(String name, int baseReagent, int dissolubility, int percent) {
        super(name, baseReagent, dissolubility);
        this.percent = percent;
    }

    @Override
    public int getReagent() {
        return super.getReagent() / (percent / 100);
    }
}
