import java.util.Scanner;

public class Exercise2_13 {

    /**
     * Takes user input of type double.
     * Returns in terminal the interest rate you would receive after
     * depositing the same amount over 6 months.
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");

        double moneyInput = Double.parseDouble(userInput.nextLine()); // Takes input
        double moneyInBank = 0; // Container
        double monthlyInterest = 0.05 / 12; // Rate

        // 6 iteration
        for (int i = 0; i < 6; i++) {
            moneyInBank += moneyInput; // Deposit then interest
            moneyInBank *= (1 + monthlyInterest);
        }
        System.out.printf("%.2f", moneyInBank);
    }
}