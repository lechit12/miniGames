package pl.minigames;


import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;


class RandomNumberGeneratorTest {

    @Test
    public void should_assert_false_if_random_number_is_not_in_bound() {
        //given
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(new SecureRandom(),new HashSet<>());
        Set<Integer> randomNumbers = randomNumberGenerator.generateRandom();
        //when
        boolean response = randomNumbers.stream().anyMatch(i -> i < 1 | i > 99);
        //then
        assertFalse(response);
    }



}