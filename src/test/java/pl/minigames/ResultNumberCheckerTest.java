package pl.minigames;

import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ResultNumberCheckerTest extends Scan {

    @Test
    public void should_return_true_when_user_is_winners() {
        Set<Integer> givenNumbers = Set.of(1, 2, 3, 4, 5, 6);
        LottoNumbersGetter lottoNumbersGetter = new LottoNumbersGetter(mockScannerIn(givenNumbers), new HashSet<>());
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(new SecureRandom(), givenNumbers);
        ResultNumberChecker resultNumberChecker = new ResultNumberChecker(randomNumberGenerator, lottoNumbersGetter);

        // when
        Set<Integer> numbersFromUser = lottoNumbersGetter.numbersFromUser();
        Set<Integer> randomNumbers = Set.of(1, 2, 3, 4, 5, 6); // Losowe liczby, które nie zawierają liczb od użytkownika
        boolean response = resultNumberChecker.isWinner(randomNumbers, numbersFromUser);

        // then
        assertTrue(response, "Should return true when all user numbers are present in the random numbers set.");
    }
    @Test
    public void should_return_false_when_user_is_not_winner() {
        // given
        Set<Integer> givenNumbers = Set.of(1, 2, 3, 4, 5, 6);
        LottoNumbersGetter lottoNumbersGetter = new LottoNumbersGetter(mockScannerIn(givenNumbers), new HashSet<>());
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(new SecureRandom(), givenNumbers);
        ResultNumberChecker resultNumberChecker = new ResultNumberChecker(randomNumberGenerator, lottoNumbersGetter);

        // when
        Set<Integer> numbersFromUser = lottoNumbersGetter.numbersFromUser();
        Set<Integer> randomNumbers = Set.of(7, 8, 9, 10, 11, 12); // Losowe liczby, które nie zawierają liczb od użytkownika
        boolean response = resultNumberChecker.isWinner(randomNumbers, numbersFromUser);

        // then
        assertFalse(response, "Should return false when not all user numbers are present in the random numbers set.");
    }

}


