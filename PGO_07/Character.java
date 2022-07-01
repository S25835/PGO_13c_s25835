package PGO_07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Character {
    private Location location;
    private String name;
    private int health;
    private int statusRank;

    private static List<Character> instances = new ArrayList<>();

    public Character(String name, Location location) {
        this.setName(name);
        this.setLocation(location);
        this.health=100;
        instances.add(this);
        this.setStatusRank(1);
    }

    private void characterStatus() {
        System.out.println(getName()+" : "+getHealth());
    }

    public static void status() {
        System.out.println("====Status====");

        instances.sort(Comparator.comparing(Character::getStatusRank));
        for (Character character : instances) {
            character.characterStatus();
        }

        System.out.println("==============");
    }


    public void say(String txt, Character chr) {
        System.out.println(this.name + " to " + chr.getName());
        System.out.println("    " + txt);
    }

    public void doSth(String txt) {
        System.out.println("I am "+this.getName()+", I am " + txt);
    }

    public static void doSth(String txt, Character...chars) {
        for(int i=0; i<chars.length; i++) {
            chars[i].doSth(txt);
        }
    }

    public void moveTo(Location newLocation) throws StoryViolationException {
        if(health == 0)
            throw new StoryViolationException("This character is dead");
        this.setLocation(newLocation);
    }

    public void introduce() {
        System.out.println("Hello, I am " + this.name);
    }

    public static void MoveAllTo(Location newLocation, Character chr1, Character chr2) {
        chr1.setLocation(newLocation);
        chr2.setLocation(newLocation);
    }

    public void die() {
        this.setHealth(0);
        System.out.println(this.getName() + " died.");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void remove() {
        Character.instances.remove(this);
    }

    public int getStatusRank() {
        return statusRank;
    }

    public void setStatusRank(int statusRank) {
        this.statusRank = statusRank;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}