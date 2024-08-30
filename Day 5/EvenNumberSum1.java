import java.util.Scanner;
public class EvenNumberSum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("The sum of even numbers from 1 to " + n + " is " + sum + ".");
        scanner.close();
    }
}