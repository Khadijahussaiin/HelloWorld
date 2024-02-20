import java.util.Scanner;

public class TommerTilCentimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("indtast længden i tommer ");
        double tommer = input.nextDouble();

        double tommerTilCM = (tommer * 2.53);
        final double centimeter = tommer * 2.53;

        System.out.println(tommer + " tommer svare til " + tommerTilCM + "cm");

    }
}
