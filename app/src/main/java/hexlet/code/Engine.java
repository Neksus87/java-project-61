package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void run(String description, String[][] roundsData) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(description);

        for (String[] roundData : roundsData) {
            String question = roundData[0];
            String correctAnswer = roundData[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.next();

            if (!playerAnswer.equals(correctAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", playerAnswer, correctAnswer);
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + playerName + "!");
    }
}
