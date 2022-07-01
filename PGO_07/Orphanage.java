package PGO_07;

import java.util.ArrayList;
import java.util.List;

public class Orphanage extends Location {
    private Location location;
    private List<Child> children;

    public Orphanage(String name, Location location) {
        super(name);
        this.location = location;
        children = new ArrayList<>();
    }

    public void addChild(Child child) {
        children.add(child);
        child.setLocation(this.location);
    }
}