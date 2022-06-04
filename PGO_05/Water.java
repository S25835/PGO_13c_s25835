package PGO_05;

public class Water extends Liquid {
    private boolean distilated;

    public Water(String name, int baseReagent, int dissolubility, boolean distilated) {
        super(name, baseReagent, dissolubility);
        this.distilated = distilated;
    }

    public boolean isDistilated() {
        return distilated;
    }

    @Override
    public int getReagent() {
        return distilated ? super.getReagent() : super.getReagent() / 2;
    }
}
