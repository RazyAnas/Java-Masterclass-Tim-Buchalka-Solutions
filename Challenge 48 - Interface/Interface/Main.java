package Interface;
import java.util.ArrayList;
import java.util.List;

// TEST CODE
public class Main {
    public static void main(String[] args) {
        Player player = new Player("Tim", 10, 100);
        System.out.println("Initial player: " + player);

        player.setName("Jim");
        player.setHitPoints(20);
        player.setStrength(90);
        player.setWeapon("Axe");
        System.out.println("Updated player: " + player);

        List<String> savedPlayer = player.write();
        System.out.println("Saved player data: " + savedPlayer);

        List<String> newPlayerData = new ArrayList<>();
        newPlayerData.add("Jon");
        newPlayerData.add("5");
        newPlayerData.add("50");
        newPlayerData.add("Hammer");
        player.read(newPlayerData);
        System.out.println("After reading new data: " + player);

        Monster monster = new Monster("Ogre", 10, 150);
        System.out.println("Initial monster: " + monster);

        List<String> savedMonster = monster.write();
        System.out.println("Saved monster data: " + savedMonster);

        List<String> newMonsterData = new ArrayList<>();
        newMonsterData.add("Dragon");
        newMonsterData.add("50");
        newMonsterData.add("200");
        monster.read(newMonsterData);
        System.out.println("After reading new data: " + monster);
    }
}
