package pl.minigames;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class WinningAnnouncerTest {


    @Test
    public void should_return_winning_result() {
        WinningAnnouncer winningAnnouncer = new WinningAnnouncer();
        Set<Integer> numbers1 = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> numbers2 = Set.of(1, 2, 3, 4, 5, 6);

        //when
        boolean areNumbersEqual = numbers1.equals(numbers2);
        String response = winningAnnouncer.isWinner(areNumbersEqual);
        assertTrue(response.equals(" Wygrałeś!"));
    }

    @Test
    public void should_return_not_winner_result() {
        WinningAnnouncer winningAnnouncer = new WinningAnnouncer();
        Set<Integer> numbers1 = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> numbers2 = Set.of(1, 2, 23, 4, 5, 6);

        //when
        boolean areNumbersEqual = numbers1.equals(numbers2);
        String response = winningAnnouncer.isWinner(areNumbersEqual);
        assertTrue(response.equals(" Spróbuj innym razem."));
    }


}