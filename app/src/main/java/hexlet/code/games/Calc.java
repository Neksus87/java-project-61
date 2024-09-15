package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final int MAX_NUMBER = 35;
    private static final String[] OPERATIONS = {"+", "-", "*"};

    public static void start() {
        String instructions = "What is the result of the expression?";
        String[][] gameData = new String[3][2];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int num1 = random.nextInt(MAX_NUMBER) + 1;
            int num2 = random.nextInt(MAX_NUMBER) + 1;
            String operation = OPERATIONS[random.nextInt(OPERATIONS.length)];

            String expression = num1 + " " + operation + " " + num2;
            gameData[i][0] = expression;
            gameData[i][1] = String.valueOf(calculate(num1, num2, operation));
        }

        Engine.runGame("Calc", gameData, instructions);
    }

    private static int calculate(int num1, int num2, String operation) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }
}