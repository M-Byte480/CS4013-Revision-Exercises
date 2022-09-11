import java.util.Scanner;

public class Exercise4_25 {

    public static int sum(int n){
        int total = 0;
        for (int iteration = 0; iteration <= n; iteration++) {
            for (int sum = 1; sum <= iteration; sum++) {
                total += sum;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        while(true) {
            try {
                System.out.print("Enter a number: ");
                Scanner terminal = new Scanner(System.in);
                int userInput = terminal.nextInt();
                System.out.println("\n" + sum(userInput));
                break;
            } catch (Exception e) {
                System.out.println("Please enter an integer\n");
            }
        }
    }
}
