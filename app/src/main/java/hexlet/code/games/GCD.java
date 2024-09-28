package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    public static final int MAX_NUMBER = 100;

    public static void play() {
        String description = "Find the greatest common divisor of given numbers.";
        String[][] roundsData = new String[Engine.ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number1 = random.nextInt(MAX_NUMBER) + 1;
            int number2 = random.nextInt(MAX_NUMBER) + 1;
            String question = number1 + " " + number2;
            String correctAnswer = String.valueOf(gcd(number1, number2));
            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.run(description, roundsData);
    }

    // Логика определения верного ответа вынесена в отдельный метод
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
