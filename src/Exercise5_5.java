public class Exercise5_5 {
    /**
     * Prints out the highest double out of the 3 numbers
     * @param num1 double to compare
     * @param num2 double to compare
     * @param num3 double to compare
     */
    public static void displayLargestNumber(double num1, double num2, double num3){
        double max = num1;
        if(num2 > max) {
            if (num2 > num3) {
                max = num2;
            }else{
                max = num3;
            }
        } else if (num3 > max) {
            max = num3;
        }
        System.out.println(max);
    }

    /**
     * Prints out the test cases.
     * @param args
     */
    public static void main(String[] args) {
        displayLargestNumber(1,2,3);    // 3.0
        displayLargestNumber(3,2,1);    // 3.0
        displayLargestNumber(2,1,3);    // 3.0
        displayLargestNumber(3,3,3);    // 3.0
        displayLargestNumber(0.5,3.1,3);// 3.1
        displayLargestNumber(0.1,-0.1,0);// 0.1
        displayLargestNumber(-8,-10,-9);// -8.0
    }
}
