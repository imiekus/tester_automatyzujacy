package pl.cdv.tablice;

import java.util.Scanner;

public class Tab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] liczby = {1,3,34,56,12357};
        int wynik = liczby[0]*liczby[1]*liczby[2]*liczby[3]*liczby[4];
        System.out.println("Wynik to: " + wynik);
    }
}
