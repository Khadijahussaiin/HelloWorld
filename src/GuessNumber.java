import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(10) +1;

        int usersGuess = -1;
        int antalGaet = 1;

        System.out.println("indtast et tal mellem 1 og 10");

        //nu laver jeg en while loop
        while ((usersGuess = scanner.nextInt()) !=numberToGuess) {
            antalGaet++;
            if (usersGuess < numberToGuess) {
                System.out.println("Forkert, tallet jeg tænker på er større, prøv igen");
            } else {
                System.out.println("Forkert, tallet jeg tænker på er mindre, prøv igen");
            }

            }
            System.out.println("rigtig det tal jeg tænkte på!" + numberToGuess);
            System.out.println("Det tog dig " + antalGaet + " gæt at fide det rigtige tal");

        }
    }
//userguess = input.nextInt():

