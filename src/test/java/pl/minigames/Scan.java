package pl.minigames;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Scan {

    Scanner mockScannerIn(List<Integer> data) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer number : data) {
            stringBuilder.append(number).append("\n");
        }

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(stringBuilder.toString().getBytes()));
        Scanner scanner = new Scanner(System.in);
        System.setIn(stdin);

        return scanner;
    }
    Scanner mockScannerIn(Set<Integer> data) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer number : data) {
            stringBuilder.append(number).append("\n");
        }

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(stringBuilder.toString().getBytes()));
        Scanner scanner = new Scanner(System.in);
        System.setIn(stdin);

        return scanner;
    }
}
