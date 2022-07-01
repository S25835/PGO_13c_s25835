package PGO_07;

import java.util.ArrayList;
import java.util.List;

public class Voldemort extends Child {
    private int horcruxNo;
    private List<Character> targetList;

    public Voldemort(Character tom) {
        super("Lord Voldemort", tom.getLocation());
        this.setHealth(tom.getHealth());
        this.targetList=new ArrayList<>();
        setStatusRank(2);
        tom.remove();
    }

    public void createHorcruxes(int i) {
        this.setHorcruxNo(i + this.getHorcruxNo());
    }

    public void printHorcruxes() {
        System.out.println("Created horcruxes:");
        for(int i=1; i<=horcruxNo; i++) {
            System.out.println("    horcrux " + i );
        }
    }

    public void target(Character character) {
        this.targetList.add(character);
    }

    public void castSpell(String spell) {
        for(int i=0; i < targetList.size(); i++) {
            if (spell.equals(Spell.AvadaKedavra)) {
                if (targetList.get(i).getName().equals("Harry")) {
                    ((Potter) targetList.get(i)).goLOL();
                    this.die();
                } else {
                    targetList.get(i).die();
                }
            }
        }
    }

    public int getHorcruxNo() {
        return horcruxNo;
    }

    public void setHorcruxNo(int horcruxNo) {
        this.horcruxNo = horcruxNo;
    }
}