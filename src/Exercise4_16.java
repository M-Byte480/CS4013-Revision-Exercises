import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4_16 {
    /**
     * Takes number
     * @param number Number to square root
     * @return square root rounded down
     */
    public static int getSquareRoot(int number){
        return (int) Math.sqrt(number);
    }

    /**
     * Check if a number is prime
     * @param number number to check if it is prime or not.
     * @return returns boolean of the number if it's prime or not.
     */
    public static boolean isPrime(int number){

        // Force return certain values
        if(number == 0 || number == 1){
            return false;
        } else if(number == 2){
            return true;
        }
        // Check if the number itself is even.
        if(number % 2 == 0){
            return false;
        }
        // For every odd number from 3, upto the squareroot + 1, we check the divisors.
        int highestPossibleNumber = getSquareRoot(number);
        for(int i = 3; i <= highestPossibleNumber; i = i + 2){
            if(number % i == 0){
                return false;
            }
        }
        // If everything fails, its prime
        return true;
    }

    /**
     * @param number to get it's prime factors
     * @return ArrayList<Integer> containing all the prime factors
     */
    public static ArrayList<Integer> getListOfPrimeFactors(int number){
        ArrayList<Integer> listOfPrimeFactors = new ArrayList<>();

        // Check if the number is a Prime number, if so don't check anything else
        if(isPrime(number)){
            listOfPrimeFactors.add(number);
            return listOfPrimeFactors;
        }

        // Get the squareroot rounded down + 1 and check every number if it's a prime or not AND divide our number
        int highestNumberToCheck = getSquareRoot(number) + 1;
        for (int i = 0; i <= highestNumberToCheck; i++) {
            if(isPrime(i) && number % i == 0){
                listOfPrimeFactors.add(i);
            }
        }

        return listOfPrimeFactors;
    }

    /**
     * Takes int input from terminal and returns all it's prime factors.
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a number to Check: ");
        int numberOfUser = userInput.nextInt();
        for (int primeFactor:
        getListOfPrimeFactors(numberOfUser)) {
            System.out.print(primeFactor + ", ");
        }
        System.out.println();
    }

}
