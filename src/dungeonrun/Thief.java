package dungeonrun;

public class Thief extends HeroesAbstract {
    
    private int initiative = 7;
    private int health = 5;
    private int attack = 5;
    private int agility = 7;

    @Override
    public void stats() {
        
        System.out.println("THIEF:");
        System.out.println("Initiative: 7");
        System.out.println("Health: 5");
        System.out.println("Attack: 5");
        System.out.println("Agility: 7");
        System.out.println("Special: 25% critical damage");
    }
    
}
