import java.util.Scanner;
//scanner
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hvad er min vægt");
        double vægt = input.nextDouble();

        System.out.print("Hvad er min højde");
        double højde = input.nextDouble();

        //formel for at regne BMI
        double BMI= vægt /(højde * højde);
        System.out.println("BMI: " + BMI);

        //Betingelser
        if (BMI<18.5) {
            System.out.println("Er din BMI undervægtigt");
        }
            else if (BMI<=25){
            System.out.println("Er din BMI Nomalvægtigt");
            }
        else if (BMI<30){
            System.out.println("Er din BMI overvægtigt");
        }
        else {
            System.out.println("Er din BMI svært overvægtigt");}

        }

    }

