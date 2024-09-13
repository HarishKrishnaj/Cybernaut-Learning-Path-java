public class Demo {
    private static int counter = 0;
    public static void incrementCounter() {
        counter++;
    }
    public static void main(String[] args) {
        System.out.println("Initial counter value: " + counter);
        incrementCounter();
        System.out.println("Counter value after 1st increment: " + counter);
        incrementCounter();
        System.out.println("Counter value after 2nd increment: " + counter);
        incrementCounter();
        System.out.println("Counter value after 3rd increment: " + counter);
        incrementCounter();
        System.out.println("Counter value after 4th increment: " + counter);
        incrementCounter();
        System.out.println("Counter value after 5th increment: " + counter);
    }
}
