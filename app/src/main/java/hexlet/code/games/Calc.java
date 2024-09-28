package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final int MAX_NUMBER = 100;
    private static final char[] OPERATIONS = new char[]{'+', '-', '*'};

    public static void play() {
        String description = "What is the result of the expression?";
        String[][] roundsData = new String[Engine.ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number1 = random.nextInt(MAX_NUMBER);
            int number2 = random.nextInt(MAX_NUMBER);
            char operation = OPERATIONS[random.nextInt(OPERATIONS.length)];
            String question = number1 + " " + operation + " " + number2;
            String correctAnswer = calculateAnswer(number1, number2, operation);

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.run(description, roundsData);
    }

    // Логика определения верного ответа вынесена в отдельный метод
    private static String calculateAnswer(int number1, int number2, char operation) {
        return switch (operation) {
            case '+' -> String.valueOf(number1 + number2);
            case '-' -> String.valueOf(number1 - number2);
            case '*' -> String.valueOf(number1 * number2);
            default -> throw new IllegalArgumentException("Unknown operation: " + operation);
        };
    }
}