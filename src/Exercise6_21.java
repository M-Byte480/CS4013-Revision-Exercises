import java.util.Scanner;

public class Exercise6_21 {
    /**
     * 50:50 chance
     * @return 0 or 1 at random
     */
    public static int coinFlip(){
        return (int) (Math.random() * 2);
    }

    /**
     * Simulates the balls rolling down, prints out each ball's path, then prints out the visual result of the balls final position
     * @param numberOfBalls Num. of balls dropped
     * @param numberOfSlots Num. of slots possible to end up in
     */
    public static void pattern(int numberOfBalls, int numberOfSlots){
        // Declare variables
        int[] ballsPerSlot = new int[numberOfSlots];
        int[][] slots = new int[numberOfBalls][numberOfSlots]; // We will store the visual result in a 2D array
        double position; // Track each ball's path
        int leftOrRight;

        // For each ball
        for (int i = 0; i < numberOfBalls; i++) {
            position = numberOfSlots / 2.0; // Set starting position

            // 0 is left, 1 is right
            for(int j = 0; j < numberOfSlots-1; j++){
                leftOrRight = coinFlip();
                if (leftOrRight == 0) {
                    position -= 0.5;
                    System.out.print("L");
                }else{
                    position += 0.5;
                    System.out.print("R");
                }
            }

            ballsPerSlot[(int) position]++; // Increase the number of balls in certain slot
            System.out.println();
        }

        // For each ball, populate the 2D array from the bottom up, until there is no balls left in the slots
        for (int row = numberOfBalls - 1; row >= 0; row--) {
            for (int column = 0; column < numberOfSlots; column++) {
                if(ballsPerSlot[column] > 0){
                    slots[row][column] = 1;
                    ballsPerSlot[column]--;
                }
            }
        }


        // Now we print from the top of the 2D array
        int temp;
        for (int row = 0; row < numberOfBalls; row++) {
            // If the row is empty, don't print out anything
            if(!isEmpty(slots[row])){
                continue;
            }
            // If it is not empty, print out where the ball(s) are.
                for(int column = 0; column < numberOfSlots; column++){
               temp = slots[row][column];
               if(temp == 0){
                   System.out.print(" ");
               }else{
                   System.out.print("O");
               }
            }
             // New Line
            System.out.println();
        }
    }

    /**
     * Check if the row is full of 0 or not
     * @param row
     * @return
     */
    public static boolean isEmpty(int[] row){
        for (int number : row) {
            if(number != 0){
                return true;
            }
        }
        return false;
    }
    /**
     * Calls Pattern after taking in the number of balls and slots
     * @param args
     */
    public static void main(String[] args) {
        Scanner terminal  = new Scanner(System.in);
        System.out.print("Enter the number of balls dropped: ");
        int balls = terminal.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int slots = terminal.nextInt();

        pattern(balls, slots);
    }
}
