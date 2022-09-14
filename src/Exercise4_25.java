import java.util.Scanner;

public class Exercise4_25 {

    /**
     * get the sum of the pattern (1) + (1 + 2) + (1 + 2 + 3) + ... + (1 + 2 + 3 + ... + n)
     * @param n
     * @return the Sum
     */
    public static int sum(int n){
        int total = 0;
        for (int iteration = 0; iteration <= n; iteration++) {
            for (int sum = 1; sum <= iteration; sum++) {
                total += sum;
            }
        }
        return total;
    }

    /**
     * Takes input of user through terminal
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner terminal = new Scanner(System.in);
        int userInput = terminal.nextInt();
        System.out.println("\n" + sum(userInput));
    }
}
