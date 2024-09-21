package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static final int MAX_NUMBER = 100;
    public static final char[] OPERATIONS = new char[]{'+', '-', '*'};

    public static void play() {
        String description = "What is the result of the expression?";
        String[][] roundsData = new String[Engine.ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number1 = random.nextInt(MAX_NUMBER);
            int number2 = random.nextInt(MAX_NUMBER);
            char operation = OPERATIONS[random.nextInt(OPERATIONS.length)];
            String question = number1 + " " + operation + " " + number2;
            String correctAnswer;

            switch (operation) {
                case '+':
                    correctAnswer = String.valueOf(number1 + number2);
                    break;
                case '-':
                    correctAnswer = String.valueOf(number1 - number2);
                    break;
                case '*':
                    correctAnswer = String.valueOf(number1 * number2);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operation: " + operation);
            }

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.run(description, roundsData);
    }
}