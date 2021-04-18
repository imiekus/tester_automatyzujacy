package pl.cdv.loops;

import  java.util.List;
import java.util.ArrayList;

public class Loop1 {
    public static void main(String[] args) {
        int[] liczby = {1, 44, 533, 4777, 34, 64, 87, 22, 16, 7, 5223, 2208, 6};
        List<Integer> evenList = new ArrayList<>();
        for (int liczba : liczby) {
            if (liczba % 2 == 0) {
                evenList.add(liczba);
            }
        }
        System.out.println("Jest " + evenList.size() + " liczb parzystych");
        System.out.println("Liczby to: ");
        for (Integer number : evenList) {
            System.out.println(number);
        }
    }
}