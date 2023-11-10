package pl.minigames;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LottoGameApplication {
    public static void main(String[] args) {

        LottoNumbersGetter lottoNumbers = new LottoNumbersGetter(new Scanner(System.in),new HashSet<>());
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(new SecureRandom(),new HashSet<>());
        RandomNumbersAnnouncer randomNumbersAnnouncer = new RandomNumbersAnnouncer(randomNumberGenerator);
        UserNumbersAnnouncer userNumbersAnnouncer = new UserNumbersAnnouncer();
        ResultNumberChecker resultNumberChecker = new ResultNumberChecker(randomNumberGenerator,lottoNumbers);
        WinningAnnouncer winningAnnouncer = new WinningAnnouncer();
        Set<Integer> randomNumbers = randomNumberGenerator.generateRandom();
         Set<Integer> userNumbers = lottoNumbers.numbersFromUser();
        System.out.println(randomNumbersAnnouncer.showMessage("Wylosowane liczby to: ", randomNumbers) + userNumbersAnnouncer.showMessage(". Twoje liczby to: ",userNumbers));
        boolean arenumbersEqual = resultNumberChecker.isWinner(randomNumbers,userNumbers);
        System.out.println(winningAnnouncer.isWinner(arenumbersEqual));


    }

}