import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise7_1 {

    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row");
        double[] row1 = Arrays.stream(terminal.nextLine()
                                                .trim()
                                                .replaceAll("\\s+", " ")
                                                .split(" "))
                                                .mapToDouble(Double::parseDouble)
                                                .toArray();
//        System.out.println(numbers);
    }
}
