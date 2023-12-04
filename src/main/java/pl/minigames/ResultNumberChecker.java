package pl.minigames;

import java.util.Set;

class ResultNumberChecker {

    RandomNumberGenerator randomNumber;
    LottoNumbersGetter userNumbers;

    public ResultNumberChecker(RandomNumberGenerator randomNumber, LottoNumbersGetter userNumbers) {
        this.randomNumber = randomNumber;
        this.userNumbers = userNumbers;
    }

    boolean isWinner(Set<Integer> randomNumbers, Set<Integer> userNumbers) {

        return randomNumbers.equals(userNumbers);
    }

}
