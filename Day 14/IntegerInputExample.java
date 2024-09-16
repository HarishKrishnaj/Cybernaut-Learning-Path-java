import java.util.InputMismatchException;
import java.util.Scanner;
public class IntegerInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Please enter an integer: ");
            try {
                number = scanner.nextInt();
                validInput = true;  
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter an integer.");
                scanner.next();
            }
        }
        System.out.println("You entered: " + number);
        scanner.close();
    }
}
