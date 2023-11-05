package pl.minigames;

public class RandomNumbersAnnouncer {

    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    String numberAnnnouncer(String message) {
        return message + randomNumberGenerator.randomNumbers;
    }
}
