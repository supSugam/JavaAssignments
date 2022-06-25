package JavaAssignments;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    // Generate a random number

    public static void main(String[] args) {

        Random random = new Random();
        int n = random.nextInt(10);

        Scanner input = new Scanner(System.in);
        int counter = 0;
        int num = 0;

        System.out.println("Guess the Number from 0-10!");
        try {
            num = input.nextInt();
        } catch (Exception e){
            System.out.println("Invalid Value Entered!");
        }
        System.out.println("Invalid Input Entered!");

        while (num!=n) {
            System.out.println("Enter Value Again.");
            try {
                num = input.nextInt();
                counter++;
            } catch (InputMismatchException ex){
                input.nextLine();
                System.out.println("Invalid Value Entered!");
                System.out.println("Total Incorrect Attempts: "+counter);
            }
        }
        System.out.println("The number is correct.");
        System.out.println("Total Incorrect Attempts: "+counter);

    }

}
