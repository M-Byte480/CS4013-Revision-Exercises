import java.util.Scanner;
public class Exercise6_13 {
    public static int getRandom(int ... numbers){
        int randomNumber = 0;
        boolean gotNumber = false;

        whileLoop:
        while(!gotNumber){
            randomNumber = (int) (Math.random() * 54 + 1);
            for (int i = 0; i < numbers.length; i++) {
                if(randomNumber == numbers[i]){
                    continue whileLoop;
                }
            }
            gotNumber = true;
        }

        return randomNumber;
    }

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Please enter Numbers using space separators: ");
        String userInput = terminal.nextLine();
        String[] stringNumbers = userInput.split(" ");
        int[] numbers = new int[stringNumbers.length];
        for(int i = 0; i < stringNumbers.length; i++){
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }
        System.out.println("\n" + getRandom(numbers));
    }
}
