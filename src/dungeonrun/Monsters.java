
package dungeonrun;


public class Monsters {
    
    private int initiative;
    private int health;
    private int attack;
    private int agility;
    private String name;

    public Monsters(int initiative, int attack, int health, int agility, String name) {
        this.initiative = initiative;
        this.health = health;
        this.attack = attack;
        this.agility = agility;
        this.name = name;
    }
    
    public int getInitiative (){
        return initiative;
    }
        
    public int getHealth () {
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }
    
    public int getAttack(){
        return attack;
    }
    
    public int getAgility(){
        return agility;
    }
    
    public String getName(){
        return name;
    }
}
        
    
    
    /*public static void main(int[] args) {
        
    }
    public static void GiantSpider() {
    int initiative = 7;
    int health = 1;
    int attack = 2;
    int agility = 3;
    // rarity = 20%
           
    }
    
    public static void Skeleton(){
    int initiative = 4;
    int health = 2;
    int attack = 3;
    int agility = 3;
    //rarity = 15%
    }
    
    public static void Orc (){
    int initiative = 6;
    int health = 3;
    int attack = 4;
    int agility = 4;
    // rarity = 10%
    }
    public static void Troll(){
    int initiative = 2;
    int health = 4;
    int attack = 7;
    int agility = 2;
    //rarity = 5%
    
    }
}
*/