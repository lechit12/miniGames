package pl.minigames;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Scanner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class UserNumbersAnnouncerTest {

    @Test
    void should_Return_message() {
        final UserNumbersAnnouncer userNumbersAnnouncer = new UserNumbersAnnouncer();
        final LottoNumbersGetter lottoNumbersGetter = new LottoNumbersGetter(new Scanner(System.in),new HashSet<>());
        String response = userNumbersAnnouncer.showMessage("Twoje liczby to: ",lottoNumbersGetter.numbersFromUser);

        assertThat(response).isEqualTo("Twoje liczby to: ",lottoNumbersGetter.numbersFromUser);
    }

}