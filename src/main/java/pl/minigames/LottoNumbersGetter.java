package pl.minigames;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class LottoNumbersGetter {

    private int number;
    private final Scanner scanner;

    final Set<Integer> numbersFromUser;

    public LottoNumbersGetter() {
        this.scanner = new Scanner(System.in);
        this.numbersFromUser = new HashSet<>();
    }


    Set<Integer> numbersFromUser() {
        System.out.println("Podaj 6 liczb od 1-99");
        for (int i = 0; i < 6; i++) {
            number = scanner.nextInt();
            numbersFromUser.add(number);
        }
        return numbersFromUser;
    }


    public Set<Integer> getNumbersFromUser() {
        return numbersFromUser;
    }
}
