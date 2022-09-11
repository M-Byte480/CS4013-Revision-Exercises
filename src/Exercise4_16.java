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

        int highestNumberToCheck = getSquareRoot(number) + 1;
        for (int i = 0; i <= highestNumberToCheck; i++) {
            if(isPrime(i) && number % i == 0){

                    listOfPrimeFactors.add(i);

            }
        }

        return listOfPrimeFactors;
    }
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
