import java.util.Scanner;

public class Bank {

    static double balance = 3000.0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.println("Enter Your choice:");
            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> checkBalance();

                case 2 -> withdraw(sc);

                case 3 -> deposit(sc);

                case 4 -> {
                    System.out.println("Thank you!");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }

    static void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    static void withdraw(Scanner sc) {

        System.out.println("Enter the withdrawal amount:");
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("Amount cannot be negative!");
        }
        else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + balance);
        }
    }

    static void deposit(Scanner sc) {

        System.out.println("Enter the deposit amount:");
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("Amount cannot be negative!");
        }
        else {
            balance += amount;
            System.out.println("Deposit successful!");
            System.out.println("New balance: " + balance);
        }
    }
}