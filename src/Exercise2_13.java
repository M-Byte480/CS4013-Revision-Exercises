import java.util.Scanner;

public class Exercise2_13 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");

        double moneyInput = Double.parseDouble(userInput.nextLine());
        double moneyInBank = 0;
        double monthlyInterest = 0.05 / 12;

        for (int i = 0; i < 6; i++) {
            moneyInBank += moneyInput;
            moneyInBank *= (1 +monthlyInterest);
        }
        System.out.printf("%.2f", moneyInBank);
    }
}