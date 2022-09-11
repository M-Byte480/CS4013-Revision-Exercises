import java.util.Arrays;
import java.util.Scanner;

public class Exercise6_21 {
    public static int coinFlip(){
        return (int) (Math.random() * 2);
    }

    public static void pattern(int numberOfBalls, int numberOfSlots){
        int[] ballsPerSlot = new int[numberOfSlots];
        int[][] slots = new int[numberOfBalls][numberOfSlots];
        double position;
        int leftOrRight;
        for (int i = 0; i < numberOfBalls; i++) {
            position = numberOfSlots / 2.0;

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

            ballsPerSlot[(int) position]++;
            System.out.println(slots.length);
        }
        System.out.println(Arrays.toString(ballsPerSlot));

        for (int row = numberOfBalls - 1; row >= 0; row--) {
            for (int column = 0; column < numberOfSlots; column++) {
                if(ballsPerSlot[column] > 0){
                    slots[row][column] = 1;
                    ballsPerSlot[column]--;
                }
            }
        }

        int temp;
        for (int row = 0; row < numberOfBalls; row++) {
            for(int column = 0; column < numberOfSlots; column++){
               temp = slots[row][column];
               if(temp == 0){
                   System.out.print(" ");
               }else{
                   System.out.print("O");
               }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner terminal  = new Scanner(System.in);
        System.out.print("Enter the number of balls dropped: ");
        int balls = terminal.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int slots = terminal.nextInt();

        pattern(balls, slots);
    }
}
