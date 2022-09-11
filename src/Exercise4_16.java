import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4_16 {
    /**
     * Takes number
     * @param number
     * @return square root down
     */
    public static int getSquareRoot(int number){
        return (int) Math.sqrt(number);
    }

    public static boolean isPrime(int number){

        if(number == 0 || number == 1){
            return false;
        } else if(number == 2){
            return true;
        }
        if(number % 2 == 0){
            return false;
        }
        int highestPossibleNumber = getSquareRoot(number);
        for(int i = 3; i <= highestPossibleNumber; i = i + 2){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }


    public static ArrayList<Integer> getListOfPrimeFactors(int number){
        ArrayList<Integer> listOfPrimeFactors = new ArrayList<>();

        if(isPrime(number)){
            listOfPrimeFactors.add(number);
            return listOfPrimeFactors;
        }

        int highestNumberToCheck = getSquareRoot(number);
        for (int i = 0; i < highestNumberToCheck; i++) {
            if(isPrime(i)){
                listOfPrimeFactors.add(i);
            }
        }

        return listOfPrimeFactors;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int numberOfUser = userInput.nextInt();
        System.out.println(getListOfPrimeFactors(numberOfUser).toString());
    }

}
