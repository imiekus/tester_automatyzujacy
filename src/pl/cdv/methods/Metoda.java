package pl.cdv.methods;

import java.util.Scanner;

public class Metoda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        saySomething(getSomething(scanner));
        int[] nums = {5, 5, 4, 4, 5};
        float average = calculateAverage(nums);
        System.out.println(("Average is: " + average));
    }

    public static void saySomething(String napis) {
        if (napis.length() > 0) {
            System.out.println("I say " + napis);
        }
    }

    public static String getSomething(Scanner scanner) {
        System.out.println("Type what you want me to say: ");
        return scanner.next();
    }

    public static float calculateAverage(int[] nums) {
        int sum = 0;
        for(int number: nums) {
            sum += number;
        }
        float average = sum / (float)nums.length;
        return average;
    }
}
