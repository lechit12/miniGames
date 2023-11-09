package pl.minigames;

public class LottoGameApplication {
    public static void main(String[] args) {

        LottoNumbersGetter lottoNumbers= new LottoNumbersGetter();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        RandomNumbersAnnouncer randomNumbersAnnouncer = new RandomNumbersAnnouncer(randomNumberGenerator);
        UserNumberResult userNumberResult = new UserNumberResult();
        lottoNumbers.numbersFromUser();
        System.out.println(randomNumbersAnnouncer.numberAnnnouncer("Wylosowane liczby to: ",randomNumberGenerator.generateRandom())+userNumberResult.userNumbers(". Twoje liczby to: ")+lottoNumbers.numbersFromUser);



    }

}