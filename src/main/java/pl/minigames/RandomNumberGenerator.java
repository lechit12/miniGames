package pl.minigames;

import lombok.AllArgsConstructor;

import java.security.SecureRandom;
import java.util.Set;

@AllArgsConstructor
class RandomNumberGenerator implements RandomGenerable {

    private final int MIN_VALUE = 1;
    private final int MAX_VALUE = 99;
    private final SecureRandom random;
    private final Set<Integer> randomNumbers;

    @Override
    public Set<Integer> generateRandom() {
        do {
            randomNumbers.add(random.nextInt(MAX_VALUE - MIN_VALUE) + 1);
        }
        while (randomNumbers.size() != 6);

        return randomNumbers;
    }


}
