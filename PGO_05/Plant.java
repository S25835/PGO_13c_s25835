package PGO_05;

public class Plant extends Ingredient {
    private int toxity;

    public Plant(String name, int baseReagent, int toxity) {
        super(name, baseReagent);
        this.toxity = toxity;
    }

    public int getToxity() {
        return toxity;
    }

    @Override
    public int getReagent() {
        return super.getReagent() * toxity;
    }
}
