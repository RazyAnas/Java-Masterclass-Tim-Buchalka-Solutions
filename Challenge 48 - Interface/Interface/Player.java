package Interface;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{

    // It has four fields.
    // Two Strings called name and weapon.
    private String name;
    private String weapon;

    // Two ints called hitPoints and strength.
    private int hitPoints;
    private int strength;

    // A constructor that accepts a String (name)
    // and two ints (hitPoints and strength).
    // It initialises name, hitPoints and strength
    // It initialises weapon with the default weapon "Sword"
    public Player(String name, int hitPoints, int strength) {

        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    // And eleven methods:
    // Getters and setters for all four fields.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    // write(), same as interface.
    // Return a List of the fields in the order they appear in toString().
    @Override
    public List<String> write() {

        List<String> values = new ArrayList<>();
        values.add(this.name);
        values.add("" + this.hitPoints);
        values.add("" + this.strength);
        values.add(this.weapon);
        return values;

    }

    // read(), same as interface.
    // Store the values in the List, in the order they appear in toString().
    @Override
    public void read(List<String> list) {

        // Make sure the List is not null
        // the size() is greater than 0 before storing the values.
        if (list != null && !list.isEmpty()) {
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
            this.weapon = list.get(3);
        }
    }

    // toString(), Players overriding toString() method.
    // It takes no arguments and returns a String in the following format:
    // Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
