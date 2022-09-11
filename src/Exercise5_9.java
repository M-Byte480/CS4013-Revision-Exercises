public class Exercise5_9 {
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFeet(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.printf("%-12s%-12s%-7s%-12s%s\n","Feet","Meters","|","Meters","Feet");
        System.out.println("-".repeat(12+12+7+12+4+2));
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-12.1f%-12.3f%-7s%-12.1f%.3f\n",(i+1) * 1.0, footToMeter(i+1),"|",i * 5.0 + 20, meterToFeet(i*5.0+20));

        }
    }
}
