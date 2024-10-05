package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final int MAX_NUMBER = 100;

    public static void play() {
        String description = "Find the greatest common divisor of given numbers.";
        String[][] roundsData = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number1 = Utils.getRandomInt(1, MAX_NUMBER);
            int number2 = Utils.getRandomInt(1, MAX_NUMBER);
            String question = number1 + " " + number2;
            String correctAnswer = String.valueOf(gcd(number1, number2));
            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.run(description, roundsData);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}