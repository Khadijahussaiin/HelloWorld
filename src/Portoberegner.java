import java.util.Scanner;

public class Portoberegner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pris = 0;
        System.out.print("Hvad er vægten på dit brev");
        double vægt = input.nextDouble();


        if (vægt <= 0 || vægt > 2000) {
            System.out.println(" Et brev med denne vægt kan vi ikke sende");
        } else {
            if (vægt <= 100) {
                pris = 25;
            } else if (vægt < 250) {
                pris = 50;
            } else if (vægt <= 2000) {
                pris = 75;
            }
            System.out.println(" Hvis vægten på brevet er " + vægt + " er prisen " + pris);
        }
    }
}