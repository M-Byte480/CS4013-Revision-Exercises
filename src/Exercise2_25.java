import java.util.Scanner;

public class Exercise2_25 {
    /**
     * Once ran, it takes 6 inputs from console, then does calculations
     *
     */
    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = consoleInput.nextLine();

        System.out.print("Enter hours: ");
        double hours = consoleInput.nextDouble();

        System.out.print("Enter payrate: ");
        double payrate = consoleInput.nextDouble();

        System.out.print("Enter federal tax: ");
        double federalTaxRate = consoleInput.nextDouble();

        System.out.print("Enter state tax: ");
        double stateTaxRate = consoleInput.nextDouble();


        // Calculations for the remaining items
        double wage = hours * payrate;
        double federalTax = wage * federalTaxRate;
        double stateTax = wage * stateTaxRate;
        double totalDeduction = stateTax + federalTax;
        double takeHomeMoney = wage - totalDeduction;

        // Format print
        System.out.println("\n\nEmployee Name: " + name);
        System.out.printf("Hours Worked: %.2f", hours);
        System.out.printf("Pay Rate: $%.2f\n", payrate);
        System.out.printf("Gross Pay: $%.2f\n", wage);
        System.out.println("Deductions:");
        System.out.printf("    Federal Witholding (%s): $%.2f\n", federalTaxRate * 100 + "%", federalTax);
        System.out.printf("    State Witholding (%s): $%.2f\n", stateTaxRate * 100 + "%", stateTax );
        System.out.printf("    Total Deduction: $%.2f\n", totalDeduction);
        System.out.printf("Net Pay: $%.2f", takeHomeMoney);

    }
}
