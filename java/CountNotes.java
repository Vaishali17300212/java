import java.util.Scanner;

public class CountNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();
        scanner.close();

        int notes;

        
        if (amount >= 500) {
            notes = amount / 500;
            System.out.println("500 Rs notes: " + notes);
            amount = amount % 500;
        }
        if (amount >= 200) {
            notes = amount / 200;
            System.out.println("200 Rs notes: " + notes);
            amount = amount % 200;
        }
        if (amount >= 100) {
            notes = amount / 100;
            System.out.println("100 Rs notes: " + notes);
            amount = amount % 100;
        }
        if (amount >= 50) {
            notes = amount / 50;
            System.out.println("50 Rs notes: " + notes);
            amount = amount % 50;
        }
        
        if (amount >= 10) {
            notes = amount / 10;
            System.out.println("10 Rs notes: " + notes);
            amount = amount % 10;
        }
        
        if (amount >= 2) {
            notes = amount / 2;
            System.out.println("2 Rs coins: " + notes);
            amount = amount % 2;
        }
        if (amount >= 1) {
            System.out.println("1 Rs coins: " + amount);
        }
    }
}
