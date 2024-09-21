package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;

    public static void play() {
        String description = "What number is missing in the progression?";
        String[][] roundsData = new String[Engine.ROUNDS][2];

        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
            int start = random.nextInt(10);
            int step = random.nextInt(5) + 1;
            int missingIndex = random.nextInt(length);

            StringBuilder progression = new StringBuilder();
            int correctAnswer = 0;
            for (int j = 0; j < length; j++) {
                if (j == missingIndex) {
                    progression.append(".. ");
                    correctAnswer = start + step * j;
                } else {
                    progression.append(start + step * j).append(" ");
                }
            }

            roundsData[i][0] = progression.toString().trim();
            roundsData[i][1] = Integer.toString(correctAnswer);
        }

        Engine.run(description, roundsData);
    }
}