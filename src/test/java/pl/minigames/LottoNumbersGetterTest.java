package pl.minigames;

import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class LottoNumbersGetterTest {

    @Test
    public void should_return_6_numbers_taken_from_user()
    {
        //given
        LottoNumbersGetter lottoNumbersGetter = new LottoNumbersGetter(new Scanner(System.in),new HashSet<>());
        Set<Integer> numbers=lottoNumbersGetter.numbersFromUser;
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        assertThat(numbers).isEqualTo(Set.of(1,2,3,4,5,6));

    }

    @Test
    public void should_assert_false_if_numbers_not_in_range()
    {
        //given
        LottoNumbersGetter lottoNumbersGetter = new LottoNumbersGetter(new Scanner(System.in),new HashSet<>());
        Set<Integer> numbers = lottoNumbersGetter.numbersFromUser;
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(100);

        boolean response = !numbers.stream().allMatch(n-> n>=1 && n<=99);
        assertFalse(response);
    }

}