package pl.minigames;


public class WinningAnnouncer {


    public String isWinner(boolean arenumbersEqual) {
        if (arenumbersEqual) {
            return " Wygrałeś!";
        } else {
            return " Spróbuj innym razem.";
        }
    }
}
