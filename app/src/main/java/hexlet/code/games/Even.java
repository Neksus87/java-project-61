package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static final int MAX_NUMBER = 100;

    public static void play() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[Engine.ROUNDS][2];
        Random random = new Random();

        // Логика определения верного ответа вынесена в отдельный метод
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = random.nextInt(MAX_NUMBER);
            String question = String.valueOf(number);
            String correctAnswer = isEven(number) ? "yes" : "no";
            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.run(description, roundsData);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
