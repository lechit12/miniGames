package pl.minigames;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserNumbersAnnouncer implements Informable {
    @Override
    public String showMessage(String message, Set<Integer> numbers) {
        return message + numbers;
    }
}
