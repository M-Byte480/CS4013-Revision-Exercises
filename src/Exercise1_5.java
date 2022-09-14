public class Exercise1_5 {
    /**
     * Calculates the question, according to BIMDAS and since
     * each variable has decimal point, they are calculated as double.
     *
     * @return 0.4318181818181818
     */
    public static double calculate(){
        double dominator = (7.5 * 2.5 - 1.5 * 3.0);
        double numerator = (35.5 - 2.5);
        return dominator / numerator;
    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }
}
