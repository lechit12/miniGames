package pl.minigames;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserNumbersAnnouncer implements Informable{


    final LottoNumbersGetter lottoNumbersGetter = new LottoNumbersGetter(new Scanner(System.in),new HashSet<>());
    @Override
    public String showMessage(String message, Set<Integer> numbers) {
        return message + numbers;
    }
}
