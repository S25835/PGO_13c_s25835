package PGO_05;

public class Alcohol extends Liquid {
    private int percent;

    public Alcohol(String name, int baseReagent, int dissolubility, int percent) {
        super(name, baseReagent, dissolubility);
        setPercent(percent);
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        if (percent < 0 || percent > 100) {
            throw new Error("Must be between 0 and 100");
        }
        this.percent = percent;
    }

    @Override
    public int getReagent() {
        return super.getReagent() - percent;
    }
}
