package pl.minigames;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

class RandomNumberGenerator implements RandomGenerable{

    private final int MIN_VALUE = 1;
    private final int MAX_VALUE = 99;
    private final SecureRandom random;
    private final Set<Integer> randomNumbers;

    public RandomNumberGenerator(SecureRandom random, Set<Integer> randomNumbers) {
        this.random = random;
        this.randomNumbers = randomNumbers;
    }

    @Override
    public Set<Integer> generateRandom() {

        for (int i = 0; i < 6; i++) {
            randomNumbers.add(random.nextInt(MAX_VALUE - MIN_VALUE) + 1);
        }

        return randomNumbers;
    }


}
