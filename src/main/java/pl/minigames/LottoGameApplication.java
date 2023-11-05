package pl.minigames;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoGameApplication {
    public static void main(String[] args) {

        LottoNumbersGetter lottoNumbers= new LottoNumbersGetter();
        lottoNumbers.numbersFromUser();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        randomNumberGenerator.generateRandom();
        RandomNumbersAnnouncer randomNumbersAnnouncer = new RandomNumbersAnnouncer();
        randomNumbersAnnouncer.numberAnnnouncer("Wylosowane liczby to: ");

        System.out.println("Twoje liczby to: "+lottoNumbers.numbersFromUser);
    }


}