package pl.minigames;

import lombok.AllArgsConstructor;

import java.util.Set;

@AllArgsConstructor
class RandomNumbersAnnouncer implements Informable {
    private final RandomNumberGenerator randomNumberGenerator;

    @Override
    public String showMessage(String message, Set<Integer> randomNumbers) {
        return message + randomNumbers;
    }
}
