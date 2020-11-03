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
                Knight.stats();
                int confirmK = confirmHero();
                String nameK = "";

                if (confirmK == 1) {
                    nameK = name();
                    HeroesAbstract knight = new Knight(5, 9, 6, 4, nameK);
                    stats.add(knight);
                }
                break;

            case 2:
                Wizard.stats();
                int confirmW = confirmHero();
                String nameW = "";

                if (confirmW == 1) {
                    nameW = name();
                    HeroesAbstract knight = new Knight(5, 9, 6, 4, nameW);
                    stats.add(knight);
                }
                break;

            case 3:
                Thief.stats();
                int confirmT = confirmHero();
                String nameT = "";

                if (confirmT == 1) {
                    nameT = name();
                    HeroesAbstract knight = new Knight(5, 9, 6, 4, nameT);
                    stats.add(knight);
                }
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

    public static int confirmHero() {

        System.out.println("\nContinue? y/n");

        String userInput = sc.nextLine();

        if (!userInput.equalsIgnoreCase("y")) {
            chooseHero();
        }
        return 1;

    }

    public static String name() {
        System.out.println("\nEnter name");
        String input = sc.nextLine();
        return input;
    }

}
