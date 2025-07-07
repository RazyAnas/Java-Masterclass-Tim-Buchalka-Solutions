package Interface;

import java.util.ArrayList;
import java.util.List;

// Monster (class)
public class Monster implements ISaveable{

    // It has three fields.
    // One String called name and
    private String name;
    // Two ints called hitPoints and strength.
    private int hitPoints;
    private int strength;

    // A constructor that accepts a String (name) and two ints (hitPoints and strength)
    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    // And six methods:
    // Only getters for the three fields.
    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    // write(), same as interface.
    // Return a List of the fields in the order they appear in toString().
    @Override
    public List<String> write() {

        List<String> monsterValues = new ArrayList<>();
        monsterValues.add(this.name);
        monsterValues.add("" + this.hitPoints);
        monsterValues.add("" + this.strength);
        return monsterValues;

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
        }
    }

    // toString(), Monsters overriding toString() method.
    // It takes no arguments and returns a String in the following format:
    // Monster{name='Werewolf', hitPoints=20, strength=40}
    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
