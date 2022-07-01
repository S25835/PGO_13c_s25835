package PGO_07;

public class Potter extends Child {

    public Potter(String name, Location location) {
        super(name, location);
        setStatusRank(1);
        if (name.equals("Harry")){ setStatusRank(3); }
    }
    public void goLOL() {
        System.out.println(this.getName() + " goes LOL...");
    }
}