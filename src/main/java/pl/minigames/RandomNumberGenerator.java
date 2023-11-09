package pl.minigames;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class RandomNumberGenerator {

    private final int MIN_VALUE = 1;
    private final int MAX_VALUE = 99;

    Set<Integer> randomNumbers = new HashSet<>();

    Set<Integer> generateRandom() {
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            randomNumbers.add(random.nextInt(MAX_VALUE - MIN_VALUE) + 1);
        }

        return randomNumbers;
    }


    public Set<Integer> getRandomNumbers() {
        return randomNumbers;
    }
}
