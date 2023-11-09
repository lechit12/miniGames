package pl.minigames;

import java.util.Set;

class RandomNumbersAnnouncer {

    RandomNumberGenerator randomNumberGenerator;

    public RandomNumbersAnnouncer(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;

    }


    public String numberAnnnouncer(String message, Set<Integer> randomNumbers) {
        return message + randomNumbers;
    }
}
