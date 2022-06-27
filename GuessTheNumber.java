package JavaAssignments;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Random random = new Random();
        int n = random.nextInt(10);

        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int num = 0;
        try {
            System.out.println("Guess the Number from 0-10!");
            num = scan.nextInt();

        } catch (InputMismatchException exception) {
            System.out.println("Invalid Type of Input!");
            counter++;
        }

        while (num != n) {
            try {

                System.out.println("Enter the Number Again!!");
                num = scanner.nextInt();
                counter++;

            } catch (InputMismatchException ex) {
                scan.nextLine();
                System.out.println("Invalid Type of Input!");
                counter++;
            }
        }

        System.out.println("The number is correct.");
        System.out.println("Total Incorrect Attempts: " + counter);
    }
}