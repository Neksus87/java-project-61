package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();
        switch (choice) {
            case 0:
                System.out.println("Exit");
                break;
            case 1:
                // Greet logic here
                break;
            case 2:
                Even.start();
                break;
            case 3:
                Calc.start();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}