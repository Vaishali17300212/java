import java.util.Scanner;

public class PrimeUsingFactors {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Find and print the factors of the number
        System.out.print("Factors of " + num + ": ");
        int factorCount = 0;

        // Loop to find factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {  // If i is a factor of num
                System.out.print(i + " ");
                factorCount++;  // Count the number of factors
            }
        }

        // Check if the number is prime based on the number of factors
        if (factorCount == 2) {
            System.out.println("\n" + num + " is a prime number.");
        } else {
            System.out.println("\n" + num + " is not a prime number.");
        }
    }
}
