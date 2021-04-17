package pl.cdv.sterowanie;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("Co chcesz zrobić? ");
        System.out.println("1 - Pomnóż dwie liczby");
        System.out.println("2 - Dodaj dwie liczby");
        System.out.println("3 - Odejmij dwie liczby");
        System.out.println("4 - Oblicz resztę z dzielenia");
        System.out.println("0 - Zakończ działanie programu");
        Scanner scanner = new Scanner(System.in);
        int pos = scanner.nextInt();
        System.out.println("1 - Podaj liczbę 1");
        int liczba1 = scanner.nextInt();
        System.out.println("1 - Podaj liczbę 2");
        int liczba2 = scanner.nextInt();
        switch(pos) {
            case 1:
                System.out.println("Mnożenie dwóch liczb");
                int wynikMnozenia = liczba1 * liczba2;
                System.out.println("Wynik mnozenia: " + wynikMnozenia);
                break;
            case 2:
                System.out.println("Dodawanie dwóch liczb");
                int wynikDodawania = liczba1 + liczba2;
                System.out.println("Wynik dodawania: " + wynikDodawania);
                break;
            case 3:
                System.out.println("Odejmowanie dwóch liczb");
                int wynikOdejmowania = liczba1 - liczba2;
                System.out.println("Wynik odejmowania: " + wynikOdejmowania);
                break;
            case 4:
                System.out.println("Obliczanie reszty z dzielenia");
                int resztaDzielenia = liczba1%liczba2;
                System.out.println("Reszta dzielenia: " + resztaDzielenia);
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
