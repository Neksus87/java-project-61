package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static final int MAX_NUMBER = 100;

    public static void start() {
        String instructions = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gameData = new String[3][2];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(MAX_NUMBER) + 1;
            gameData[i][0] = String.valueOf(number);
            gameData[i][1] = (number % 2 == 0) ? "yes" : "no";
        }

        Engine.runGame("Even", gameData, instructions);
    }
}