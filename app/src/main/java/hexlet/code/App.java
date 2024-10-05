package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final int EXIT = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GREET + " - Greet");
        System.out.println(EVEN + " - Even");
        System.out.println(CALC + " - Calc");
        System.out.println(GCD_GAME + " - GCD");
        System.out.println(PROGRESSION + " - Progression");
        System.out.println(PRIME + " - Prime");
        System.out.println(EXIT + " - Exit");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();
        switch (choice) {
            case GREET:
                System.out.println("Hello!");
                Cli.greet();
                break;
            case EVEN:
                Even.play();
                break;
            case CALC:
                Calc.play();
                break;
            case GCD_GAME:
                GCD.play();
                break;
            case PROGRESSION:
                Progression.play();
                break;
            case PRIME:
                Prime.play();
                break;
            case EXIT:
            default:
                System.out.println("Goodbye!");
                break;
        }
    }
}
