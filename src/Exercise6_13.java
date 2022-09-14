import java.util.Scanner;
public class Exercise6_13 {
    /**
     * Returns a random number that is NOT in the argument(s)
     * @param numbers array of VarArgs int
     * @return a random number between 1 - 54 that is NOT in the VarArgs
     */
    public static int getRandom(int ... numbers){
        int randomNumber = 0;
        boolean gotNumber = false;


        whileLoop:
        while(!gotNumber){
            randomNumber = (int) (Math.random() * 54 + 1); // Make random number
            for (int number : numbers) {
                if (randomNumber == number) { // Is it in the array?
                    continue whileLoop; // If so, make a new random number
                }
            }
            gotNumber = true;
        }

        return randomNumber;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Please enter Numbers using space separators: ");

        String userInput = terminal.nextLine();
        String[] stringNumbers = userInput.split(" ");
        // Convert the String array to int array

        int[] numbers = new int[stringNumbers.length];
        for(int i = 0; i < stringNumbers.length; i++){
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }
        System.out.println("\n" + getRandom(numbers));
    }
}
