package pl.minigames;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class LottoNumbersGetterTest extends Scan {


    @Test
    public void should_return_6_numbers_taken_from_user() {
        //given
        LottoNumbersGetter lottoNumbersGetter = new LottoNumbersGetter(new Scanner(System.in), new HashSet<>());
        Set<Integer> numbers = lottoNumbersGetter.numbersFromUser;
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        assertThat(numbers).isEqualTo(Set.of(1, 2, 3, 4, 5, 6));

    }

    @Test
    public void should_return_six_numbers_when_numbers_duplicates() {
        //given
        List<Integer> givenNumbers = Arrays.asList(1, 2, 3, 3, 4, 5, 6);
        LottoNumbersGetter lottoNumbersGetter = new LottoNumbersGetter(mockScannerIn(givenNumbers), new HashSet<>());
        Set<Integer> expectedNumbers = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)));
        final Set<Integer> numbersFromUser = lottoNumbersGetter.numbersFromUser();
        assertThat(numbersFromUser).isEqualTo(expectedNumbers);
    }

    @Test
    public void should_return_six_numbers_when_one_is_not_in_range() {
        //given
        Set<Integer> givenNumbers = Set.of(1, 2, 3, 4, 5, 101, 6);
        LottoNumbersGetter lottoNumbersGetter = new LottoNumbersGetter(mockScannerIn(givenNumbers), new HashSet<>());
        Set<Integer> expectedNumbers = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)));


        final Set<Integer> numbersFromUser = lottoNumbersGetter.numbersFromUser();

        assertThat(numbersFromUser).isEqualTo(expectedNumbers);
    }


}