package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {

    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MAX_START = 10;
    private static final int MAX_STEP = 5;
    private static final int MIN_STEP = 1;

    // Логика определения верного ответа вынесена в отдельный метод
    private static int calculateMissingValue(int start, int step, int missingIndex) {
        return start + step * missingIndex;
    }

    //генерация прогрессии вынесена в отдельный метод
    private static String generateProgression(int start, int step, int length, int missingIndex) {
        StringBuilder progression = new StringBuilder();
        for (int j = 0; j < length; j++) {
            if (j == missingIndex) {
                progression.append(".. ");
            } else {
                progression.append(start + step * j).append(" ");
            }
        }
        return progression.toString().trim();
    }

    public static void play() {
        String description = "What number is missing in the progression?";
        String[][] roundsData = new String[Engine.ROUNDS][2];

        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
            int start = random.nextInt(MAX_START);
            int step = random.nextInt(MAX_STEP) + MIN_STEP;
            int missingIndex = random.nextInt(length);

            String progression = generateProgression(start, step, length, missingIndex);
            int correctAnswer = calculateMissingValue(start, step, missingIndex);

            roundsData[i][0] = progression;
            roundsData[i][1] = Integer.toString(correctAnswer);
        }

        Engine.run(description, roundsData);
    }
}
