public class Main {
    public static void main(String[] args) {
        double initialBalance = 5000.00;
        double interestRate = 0.17; // 17% interest rate

        // Month 1 Calculation
        double month1Interest = initialBalance * interestRate;
        initialBalance += month1Interest;

        // Month 2 calculation
        double month2Interest = initialBalance * interestRate;
        initialBalance += month2Interest;

        // Display results
        System.out.println("Initial Credit Card Balance: $5000.00");
        System.out.println("Interest due after 1 month: $" + month1Interest);
        System.out.println("Interest due after 2 months $" + month2Interest);
    }
}