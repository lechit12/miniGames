package pl.minigames;


import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;


class RandomNumberGeneratorTest {

    @Test
    public void should_generate_6_random_numbers_from_bound_1_to_99(){
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer> randomNumbers =randomNumberGenerator.generateRandom();

        assertThat(randomNumbers).hasSize(6);
    }
}