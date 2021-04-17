package pl.cdv.sterowanie;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("Co chcesz zrobić? ");
        System.out.println("1 - Pomnóż dwie liczby");
        System.out.println("2 - Dodaj dwie liczby");
        System.out.println("3 - Oblicz resztę z dzielenia");
        System.out.println("0 - Zakończ działanie programu");
        Scanner scanner = new Scanner(System.in);
        int pos = scanner.nextInt();
        switch(pos) {
            case 1:
                System.out.println("Mnożenie dwóch liczb");
                break;
            case 2:
                System.out.println("Dodawanie dwóch liczb");
                break;
            case 3:
                System.out.println("Obliczanie reszty z dzielenia");
                break;
            case 0:
                System.out.println("Zakończenie działania programu.");
                break;
            default:
                System.out.println("Wybrana opcja nie jest obsługiwana.");
                break;
        }
    }
}
