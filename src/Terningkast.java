import java.util.Random;

public class Terningkast {
    public static void main(String[] args) {
        Random rand = new Random();
        int terning = rand.nextInt(6) +1;
        int sum = 0;
        int forsøg = 0;

        while (sum != 7) {
            int kastEt = rand.nextInt(6) +1;
            int kastTo = rand.nextInt(6) +1;
            sum = kastEt + kastTo;
            System.out.println(kastEt + "+" + kastTo + "=" + sum);
            forsøg++;
            System.out.println("Det tog dig " + forsøg + " forsøg indtil summen af terningen er lig med 7");
        }

    }
}
