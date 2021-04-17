package pl.cdv.operators;

import java.util.Scanner;

public class Dodawanie {
    public static void main(String[] args) {
        int wynik;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę:");
        int liczba1 = scanner.nextInt();
        System.out.print("Podaj drugą liczbę:");
        int liczba2 = scanner.nextInt();

        wynik = liczba1+liczba2;
        System.out.println("Wynik dodawania: " + wynik);
        wynik = liczba1-liczba2;
        System.out.println("Wynik odejmowania: " + wynik);
        wynik = liczba1*liczba2;
        System.out.println("Wynik mnożenia: " + wynik);
        float wynikDzielenia = liczba1 / (float)liczba2;
        System.out.println("Wynik dzielenia: " + wynikDzielenia);
        wynik = liczba1%liczba2;
        System.out.println("reszta z dzielenia: " + wynik);
    }
}