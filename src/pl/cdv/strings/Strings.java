package pl.cdv.strings;

public class Strings {

    public static void main(String[] args) {
        String slonce = "Świeci słońce";
        String deszcz = "Pada deszcz";
        String tecza = "Jest tęcza";
        System.out.println(slonce + ": " + slonce.length());
        System.out.println(deszcz + ": " + deszcz.length());
        System.out.println(tecza + ": " + tecza.length());
        int dlugosc = slonce.length() + deszcz.length() + tecza.length();
        System.out.println("Suma znaków: " + dlugosc);
    }
}
