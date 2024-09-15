package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {

    public static void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswers = 0;

        while (correctAnswers < 3) {
            int number = random.nextInt(100); // случайное число от 0 до 99
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            boolean isEven = number % 2 == 0;
            String correctAnswer = isEven ? "yes" : "no";

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                correctAnswers = 0;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
}