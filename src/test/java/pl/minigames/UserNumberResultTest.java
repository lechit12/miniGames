package pl.minigames;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class UserNumberResultTest {

    @Test
    void should_Return_message() {
        final UserNumberResult userNumberResult = new UserNumberResult();

        String response = userNumberResult.userNumbers("Twoje liczby to: ");

        assertThat(response).isEqualTo("Twoje liczby to: ");
    }

}