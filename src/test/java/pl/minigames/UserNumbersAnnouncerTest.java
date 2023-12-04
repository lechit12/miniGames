package pl.minigames;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class UserNumbersAnnouncerTest extends Scan {

    @Test
    void should_Return_message() {
        final UserNumbersAnnouncer userNumbersAnnouncer = new UserNumbersAnnouncer();
        Set<Integer> givenNumbers = Set.of(1, 2, 3, 4, 5, 6);
        LottoNumbersGetter lottoNumbersGetter = new LottoNumbersGetter(mockScannerIn(givenNumbers), new HashSet<>());
        final Set<Integer> numbersFromUser = lottoNumbersGetter.numbersFromUser();

        String response = userNumbersAnnouncer.showMessage("Twoje liczby to: ", numbersFromUser);

        assertThat(response).isEqualTo("Twoje liczby to: " + numbersFromUser);
    }


}