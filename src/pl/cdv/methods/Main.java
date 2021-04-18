package pl.cdv.methods;

public class Main {
    public static void main(String[] args) {
        String txt = helloIAm("Jan", "Kowalski");
        System.out.println(txt);
        int[] tab = {12,13,54,63,11,123,2345,654,987};
        System.out.println("Smallest value: " + findMinValue(tab));
        System.out.println("Largest value: " + findMaxValue(tab));
    }

    /**
     * zwraca stringa
     * @param name String
     * @param surname String
     * @return String
     */
    public static String helloIAm(String name, String surname) {
        return "Hello, I am " + name + " " + surname;
    }

    /**
     * Funkcja zwracająca najmniejszy element z tablicy
     * @param table int tablica z danymi
     * @return int
     */
    public static int findMinValue(int[] table) {
        int min = table[0];
        for (int element: table) {
            if (element < min)  min = element;
        }
        return min;
    }

    /**
     * Funkcja zwracająca najwiekszy element z tablicy
     * @param table int tablica z danymi
     * @return int
     */
    public static int findMaxValue(int[] table) {
        int max = table[0];
        for (int element: table) {
            if (element > max)  max = element;
        }
        return max;
    }
}
