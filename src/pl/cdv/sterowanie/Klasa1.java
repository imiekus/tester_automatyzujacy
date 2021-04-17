package pl.cdv.sterowanie;

import java.util.Scanner;

public class Klasa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();
        boolean isEvenNumber = number % 2 ==0;
        if(isEvenNumber) {
            System.out.println("Liczba "+number+" jest parzysta!");
        } else {
            System.out.println("Liczba "+number+" jest nieparzysta!");
        }

        if(number > 0) {
            System.out.println("Liczba jest dodatnia");
        } else if(number < 0) {
            System.out.println("Liczba jest ujemna");
        } else {
            System.out.println("Liczba jest równa 0");
        }
    }
}
