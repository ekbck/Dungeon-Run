package dungeonrun;

public class Thief extends HeroesAbstract {

    public Thief(int initiative, int health, int attack, int agility, String name) {
        super(initiative, health, attack, agility, name);
    }

    public static void stats() {
        
        System.out.println("THIEF:");
        System.out.println("Initiative: 7");
        System.out.println("Health: 5");
        System.out.println("Attack: 5");
        System.out.println("Agility: 7");
        System.out.println("Special: 25% critical damage");
    }
    
}
