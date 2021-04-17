package pl.cdv.lists;

import java.util.ArrayList;
import  java.util.List;
import java.util.Scanner;

public class Listy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String imie;
        List<String> imiona = new ArrayList<>();
        do {
            System.out.print("Podaj imię: ");
            imie = scanner.next();
            if (imie.equals("-")) {
                break;
            }
            imiona.add(imie);
        } while (true);
        System.out.println("Podaj indeks od 0 do " + (imiona.size()-1));
        int pozycja = scanner.nextInt();
        System.out.println("Imię to: " + imiona.get(pozycja));

    }
}
