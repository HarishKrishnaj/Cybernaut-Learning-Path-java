public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5; // You can change this value to test with other numbers
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
