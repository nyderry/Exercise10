import java.util.Scanner;

/**
 * Created by Ny Derry on 7/2/2017.
 */
public class Exercise10 {
    public static void main(String[] args) {
        char contin1 = 'y';
        String contin2 = "";
        //start while loop, reuse Lab2 example.
        while (contin1 != 'n') {

            Scanner scnr = new Scanner(System.in);
            double numHeight = 0;
            //double to float to get one digit
            float numDifference = 0;

            //ask for input
            System.out.print("Enter your height inches: ");
            numHeight = scnr.nextDouble();

            if (numHeight < 54) {
                System.out.print("Sorry, you cannot ride the Raptor.");
                numDifference = (float) (54 - numHeight);
                System.out.println(" You need " + numDifference + " more inches.");
            }

            else {
                    System.out.println("Great, you can ride the Raptor!");
                }

                System.out.print("Continue? (y/n): ");
                contin2 = scnr.next();
                contin1 = contin2.charAt(0);

                System.out.println(" ");
            }
        }

    }