package pl.minigames;


import java.util.Scanner;
import java.util.Set;

class LottoNumbersGetter {

    private final Scanner scanner;

    final Set<Integer> numbersFromUser;

    public LottoNumbersGetter(Scanner scanner, Set<Integer> numbersFromUser) {
        this.scanner = scanner;
        this.numbersFromUser = numbersFromUser;
    }


    Set<Integer> numbersFromUser() {
        System.out.println("Podaj 6 liczb od 1-99");
        for (int i = 0; i < 6; i++) {
            int number = scanner.nextInt();
            numbersFromUser.add(number);
        }
        return numbersFromUser;
    }

}
