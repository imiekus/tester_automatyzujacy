package pl.cdv.scanners;

import java.util.Scanner;

public class Klawiatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* String txt;
        int firstValue;
        float secondValue;

        System.out.println("Podaj słowo: ");
        txt = scanner.nextLine();
        System.out.println("Podaj liczbe calkowita: ");
        firstValue = scanner.nextInt();
        System.out.println("Podaj liczbe zmiennoprzecinkowa: ");
        secondValue = scanner.nextFloat();

        System.out.println("Wpisane słowo to: " + txt);
        System.out.println("Pierwsza liczba to: " + firstValue);
        System.out.println("Druga liczba to: " + secondValue); */

        String imie;
        String nazwisko;
        byte wiek;
        float wzrost;
        float waga;
        System.out.println("Podaj imię: ");
        imie = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        nazwisko = scanner.nextLine();
        System.out.println("Podaj wiek: ");
        wiek = scanner.nextByte();
        System.out.println("Podaj wzrost w formacie <metry>,<centymetry>, np. '1,75': ");
        wzrost = scanner.nextFloat();
        System.out.println("Podaj wage w kilogramach, np. '65,5': ");
        waga = scanner.nextFloat();
        System.out.println("Nazywasz się " + imie + " " + nazwisko + ", masz " + wiek + " lat, twój wzrost to " + wzrost + " i ważysz " + waga + " kg." );
    }
}
