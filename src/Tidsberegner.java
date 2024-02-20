import java.util.Scanner;

public class Tidsberegner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hvor mange timer er der siden midnat ");

        int hour = input.nextInt();
        System.out.println("Der er gået " + hour + " timer siden midnat, " + "hvor mange minutter er der gået? ");

        int minuts = input.nextInt();
        System.out.println(minuts);
        System.out.println("Der er gået " + minuts + "minutter, " + " hvor mange sekunder er der gået ");

        int seconds = input.nextInt();
        System.out.println(seconds);
        System.out.println("Der er nu gået " + hour + " timer " + minuts + " minutter " + seconds + " sekunder siden midnat");

        int results = hour * 60 * 60 + minuts * 60 + seconds;
        System.out.println("Svarende til " + results + " sekunder");
    }
}

