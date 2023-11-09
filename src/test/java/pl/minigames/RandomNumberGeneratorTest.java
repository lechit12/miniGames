package pl.minigames;


import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;


class RandomNumberGeneratorTest {

    @Test
    public void should_assert_false_if_random_number_is_not_in_bound() {
        //given
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer> randomNumbers = randomNumberGenerator.generateRandom();
        //when
        boolean response = randomNumbers.stream().anyMatch(i -> i < 1 | i > 99);
        //then
        assertFalse(response);
    }

    @Test
    public void should_return_generated_random_numbers() {
        //given
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer> randomNumbers = randomNumberGenerator.generateRandom();
        //when

        //then
        assertThat(randomNumberGenerator.getRandomNumbers()).hasSize(6);
    }

}