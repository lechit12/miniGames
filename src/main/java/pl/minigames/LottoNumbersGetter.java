package pl.minigames;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class LottoNumbersGetter {

    private int number;
    Scanner scanner = new Scanner(System.in);
    Set<Integer> numbersFromUser = new HashSet<>();

    void numbersFromUser() {
        System.out.println("Podaj 6 liczb od 1-99");
        for (int i = 0; i < 6; i++) {
            number = scanner.nextInt();
            numbersFromUser.add(number);
        }
    }

}
