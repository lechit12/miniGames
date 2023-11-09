package pl.minigames;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RandomNumbersAnnouncerTest {

    @Test
    public void should_return_message_random_numbers_and_numbers_from_user(){


        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        RandomNumbersAnnouncer randomNumbersAnnouncer = new RandomNumbersAnnouncer(randomNumberGenerator);


        Set<Integer> randomNumbers = randomNumberGenerator.generateRandom();

        String announce = randomNumbersAnnouncer.numberAnnnouncer("Wylosowane liczby to: ",randomNumbers);

        assertThat(announce).isEqualTo("Wylosowane liczby to: "+ randomNumbers);

    }

}