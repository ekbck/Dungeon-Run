package dungeonrun;

public class Knight extends HeroesAbstract {
    
    private int initiative = 5;
    private int health = 9;
    private int attack = 6;
    private int agility = 4;

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }
 
    @Override
    public void stats() {

        System.out.println("     _,.");
        System.out.println("    ,` -.)");
        System.out.println("   ( _/-\\\\-._");
        System.out.println("  /,|`--._,-^|            ,");
        System.out.println("  \\_| |`-._/||          ,'|");
        System.out.println("    |  `-, / |         /  /");
        System.out.println("    |     || |        /  /");
        System.out.println("     `r-._||/   __   /  /");
        System.out.println(" __,-<_     )`-/  `./  /      KNIGHT:");
        System.out.println("'  \\   `---'   \\   /  /       Initiative: " + initiative);
        System.out.println("    |           |./  /        Health: " + health);
        System.out.println("    /           //  /         Attack: " + attack);
        System.out.println("\\_/' \\         |/  /          Agility: " + agility);
        System.out.println(" |    |   _,^-'/  /           Special: Block first attack");
        System.out.println(" |    , ``  (\\/  /_");
        System.out.println("  \\,.->._    \\X-=/^");
        System.out.println("  (  /   `-._//^`");
        System.out.println("   `Y-.____(__}");
        System.out.println("    |     {__)");
        System.out.println("          ()");
    }
}
