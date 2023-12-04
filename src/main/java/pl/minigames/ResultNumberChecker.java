package pl.minigames;

import lombok.AllArgsConstructor;

import java.util.Set;

@AllArgsConstructor
class ResultNumberChecker {
    private final RandomNumberGenerator randomNumber;
    private final LottoNumbersGetter userNumbers;

    boolean isWinner(Set<Integer> randomNumbers, Set<Integer> userNumbers) {
        return randomNumbers.equals(userNumbers);
    }

}
