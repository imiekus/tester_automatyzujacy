package pl.cdv.operators;

import java.util.Scanner;

public class Logics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę:");
        int number = scanner.nextInt();

        boolean morethan10 = number > 10;
        boolean equal0 = number == 0;
        boolean lower50 = number < 50;
        boolean moreequal20 = number >= 20;
        boolean lowerequal30 = number <= 30;
        boolean diff5 = number != 5;

        System.out.print(">10: " + morethan10);
        System.out.print(" ==0: " + equal0);
        System.out.print(" <50: " + lower50);
        System.out.print(" >=20: " + moreequal20);
        System.out.print(" <=30>: " + lowerequal30);
        System.out.print(" !=5: " + diff5);
    }
}
