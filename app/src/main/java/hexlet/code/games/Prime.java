package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {

    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MIN_PRIME_NUMBER = 2;

    public static void play() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] roundsData = new String[Engine.ROUNDS][2];

        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = random.nextInt(MAX_RANDOM_NUMBER) + 1;
            roundsData[i][0] = Integer.toString(number);
            roundsData[i][1] = isPrime(number) ? "yes" : "no";
        }

        Engine.run(description, roundsData);
    }

    // Логика определения верного ответа вынесена в отдельный метод
    private static boolean isPrime(int number) {
        if (number < MIN_PRIME_NUMBER) {
            return false;
        }
        for (int i = MIN_PRIME_NUMBER; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
