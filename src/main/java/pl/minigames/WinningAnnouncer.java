package pl.minigames;

import java.util.Set;

public class WinningAnnouncer  {


    public String isWinner(boolean arenumbersEqual) {
        if (arenumbersEqual==true)
        {
            return "Wygrałeś!";
        }
        else {
            return "Spróbuj innym razem.";
        }
    }
}
