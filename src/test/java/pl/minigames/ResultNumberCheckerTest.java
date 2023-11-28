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
    public void should_return_true_when_user_is_winner() {
        //given
        Set<Integer> givenNumbers = Set.of(1, 2, 3, 4, 5, 6);
        LottoNumbersGetter lottoNumbersGetter = new LottoNumbersGetter(mockScannerIn(givenNumbers), new HashSet<>());

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(new SecureRandom(), new HashSet<>());

        ResultNumberChecker resultNumberChecker = new ResultNumberChecker(randomNumberGenerator, lottoNumbersGetter);

        Set<Integer> numbersFromUser = lottoNumbersGetter.numbersFromUser();
        Set<Integer> randomNumbers = randomNumberGenerator.generateRandom().;
        boolean response = resultNumberChecker.isWinner(randomNumbers, numbersFromUser);


        assertTrue(response);
    }


}


