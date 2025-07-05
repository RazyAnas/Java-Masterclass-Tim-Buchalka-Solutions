package Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage =10;
//        player.loseHealth(damage);
//
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Gun");
        System.out.println("Initial health is " + tim.healthRemaining());
    }
}

class Player{
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out of the game!");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth) {
        this.health = health + extraHealth;
        if (health > 100){
            System.out.println("Player restored to 100%");
            this.health = 100;
        }
    }

}