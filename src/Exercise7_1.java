    import java.util.Scanner;

public class Exercise7_1 {

    /**
     * Get the sum of certain column of a 2D array
     * @param m 2D array
     * @param columnIndex Sum of Column
     * @return Sum of columnIndex in m
     */
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        double[][] matrix = new double[3][4];

        // Get the next 12 Double, in 3 lines and 4 arguments
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 4; column++) {
                matrix[row][column] = terminal.nextDouble();
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.printf("The sum of column %d is: %.2f\n", i + 1, sumColumn(matrix, i));
        }
    }
}
