package pl.minigames;

import java.util.Set;

class RandomNumbersAnnouncer implements Informable{

    private final RandomNumberGenerator randomNumberGenerator;

    public RandomNumbersAnnouncer(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;

    }

    @Override
    public String showMessage(String message, Set<Integer> randomNumbers) {
        return message + randomNumbers;
    }
}
