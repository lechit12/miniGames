package pl.minigames;


import lombok.AllArgsConstructor;

import java.util.Scanner;
import java.util.Set;

@AllArgsConstructor
class LottoNumbersGetter {

    private final Scanner scanner;

    final Set<Integer> numbersFromUser;


    Set<Integer> numbersFromUser() {

        System.out.println("Podaj 6 liczb od 1-99");

        while (numbersFromUser.size() < 6) {
            int number = scanner.nextInt();
            if (number < 1 || number > 99) {
                System.out.println("Liczba powinna być w zakresie 1-99");
                continue;
            }
            if (numbersFromUser.contains(number)) {
                System.out.println("Liczba nie moze sie powtarzać");
                continue;
            }
            numbersFromUser.add(number);
        }
        return numbersFromUser;

    }

}
