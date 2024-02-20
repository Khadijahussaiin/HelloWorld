import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definerer sentinel-værdien
        final int SENTINEL = -1;

        // Variabel til at gemme summen
        int sum = 0;

        // Bed brugeren om at indtaste tal eller -1 for at stoppe
        System.out.println("Indtast tal for at lægge sammen eller indtast " + SENTINEL + " for at stoppe:");

        // Loop til at lægge brugerens input sammen
        int tal;
        while ((tal = scanner.nextInt()) != SENTINEL) {
            sum += tal;
            System.out.println("Indtast næste tal eller " + SENTINEL + " for at stoppe:");
        }

        //Dette kaldes for et “sentinel-loop” (en sentinel er det brugeren taster for at standse loopet).
        System.out.println("Summen af tallene er: " + sum);


    }
}

