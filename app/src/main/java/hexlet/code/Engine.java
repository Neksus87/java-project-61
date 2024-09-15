package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS = 3;

    public static void runGame(String gameName, String[][] gameData, String instructions) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine().trim(); // Удаляем лишние пробелы

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty. Exiting the game.");
            return;
        }

        System.out.println("Hello, " + name + "!");
        System.out.println(instructions);

        for (int i = 0; i < ROUNDS; i++) {
            if (gameData[i] == null || gameData[i].length < 2) {
                System.out.println("Invalid game data. Exiting the game.");
                return;
            }

            String question = gameData[i][0];
            String correctAnswer = gameData[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().trim();

            if (!answer.equalsIgnoreCase(correctAnswer)) { // игнорирование регистра
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                scanner.close();
                return;
            } else {
                System.out.println("Correct!");
            }
        }

        System.out.println("Congratulations, " + name + "!");
        scanner.close();
    }
}