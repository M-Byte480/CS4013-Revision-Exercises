public class Exercise5_9 {
    /**
     *
     * @param foot
     * @return meters
     */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /**
     * NOTE: The value given in the question slightly doesn't match the numbers
     * used to print out. It was rounded up a tiny bit
     * @param meter
     * @return feet
     */
    public static double meterToFeet(double meter) {
        return 3.279 * meter;
    }

    /**
     * Prints out the values according the question
     * @param args
     */
    public static void main(String[] args) {
        System.out.printf("%-12s%-12s%-7s%-12s%s\n","Feet","Meters","|","Meters","Feet");
        System.out.println("-".repeat(12+12+7+12+4+2));
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-12.1f%-12.3f%-7s%-12.1f%.3f\n",(i+1) * 1.0, footToMeter(i+1),"|",i * 5.0 + 20, meterToFeet(i*5.0+20));

        }
    }
}
