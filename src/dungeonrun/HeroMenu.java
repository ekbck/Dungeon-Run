package dungeonrun;

import java.util.ArrayList;
import java.util.Scanner;

public class HeroMenu {
    
    static Scanner sc = new Scanner(System.in);
    static ArrayList<HeroesAbstract> stats = new ArrayList<>(); // Komma på hur vi sparar både typ av hjälte och valt namn

    public static void chooseHero() {
        
        System.out.println("                      =============== ");
        System.out.println("                     |  SELECT HERO  |");
        System.out.println("                     |   1. Knight   |");
        System.out.println("                     |   2. Wizard   |");
        System.out.println("                     |   3. Thief    |");
        System.out.println("                      =============== ");
        
        int userInput = sc.nextInt();
        sc.nextLine();
        
        switch (userInput) {
            case 1:
                HeroesAbstract knight = new Knight();
                stats.add(knight);
                knight.stats();
                confirmHero();
                break;
                
            case 2:
                HeroesAbstract wizard = new Wizard();
                stats.add(wizard);
                wizard.stats();
                confirmHero();
                break;
                
            case 3:
                HeroesAbstract thief = new Thief();
                stats.add(thief);
                thief.stats();
                confirmHero();
                break;
                
            default:
                System.out.println("ERROR! Please enter 1, 2 or 3");
                chooseHero();
        }
    } 
    
    public static void loadCharacter() {
        
        System.out.println(" ================================= ");
        System.out.println("|           LOAD CHARACTER        |");
        System.out.println("|   1. [insert saved character]   |");
        System.out.println("|   2. [insert saved character]   |");
        System.out.println("|   3. [insert saved character]   |");
        System.out.println(" ================================= ");
    }
    
    public static void confirmHero() {
        
        System.out.println("\nContinue? y/n");
        
        String userInput = sc.nextLine();
        
        if (userInput.equalsIgnoreCase("y")) {
            System.out.println("\nEnter name");
            String input = sc.nextLine();
        } else {
            chooseHero();
        }  
        
    }
}
