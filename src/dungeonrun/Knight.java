package dungeonrun;

public class Knight extends HeroesAbstract {
    
    private int initiative = 5;
    private int health = 9;
    private int attack = 6;
    private int agility = 4;

    @Override
    public void stats() {

        System.out.println("     _,.");
        System.out.println("    ,` -.)");
        System.out.println("   ( _/-\\\\-._");
        System.out.println("  /,|`--._,-^|            ,");
        System.out.println("  \\_| |`-._/||          ,'|");
        System.out.println("    |  `-, / |         /  /");
        System.out.println("    |     || |        /  /");
        System.out.println("     `r-._||/   __   /  /      =============================");
        System.out.println(" __,-<_     )`-/  `./  /      | KNIGHT:                     |");
        System.out.println("'  \\   `---'   \\   /  /       | Initiative: " + initiative +"               |");
        System.out.println("    |           |./  /        | Health: " + health + "                   |");
        System.out.println("    /           //  /         | Attack: " + attack + "                   |");
        System.out.println("\\_/' \\         |/  /          | Agility: " + agility + "                  |");
        System.out.println(" |    |   _,^-'/  /           | Special: Block first attack |");
        System.out.println(" |    , ``  (\\/  /_            =============================");
        System.out.println("  \\,.->._    \\X-=/^");
        System.out.println("  (  /   `-._//^`");
        System.out.println("   `Y-.____(__}");
        System.out.println("    |     {__)");
        System.out.println("          ()");
    }
}
