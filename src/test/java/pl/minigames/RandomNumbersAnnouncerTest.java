package pl.minigames;

import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RandomNumbersAnnouncerTest {

    @Test
    public void should_return_message_random_numbers_and_numbers_from_user() {


        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(new SecureRandom(), new HashSet<>());

        RandomNumbersAnnouncer randomNumbersAnnouncer = new RandomNumbersAnnouncer(randomNumberGenerator);


        Set<Integer> randomNumbers = randomNumberGenerator.generateRandom();

        String announce = randomNumbersAnnouncer.showMessage("Wylosowane liczby to: ", randomNumbers);

        assertThat(announce).isEqualTo("Wylosowane liczby to: " + randomNumbers);

    }

}