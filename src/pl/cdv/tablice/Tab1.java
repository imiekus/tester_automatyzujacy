package pl.cdv.tablice;

import java.util.Scanner;

public class Tab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];
        System.out.println("Podaj pierwsze imię: ");
        names[0] = scanner.next();
        System.out.println("Podaj drugie imię: ");
        names[1] = scanner.next();
        System.out.println("Podaj trzecie imię: ");
        names[2] = scanner.next();

        System.out.println("Imiona z tablicy to: " + names[0] + ", " + names[1] + ", "+ names[2]);
    }
}
