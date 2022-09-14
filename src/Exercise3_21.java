import java.util.Scanner;

public class Exercise3_21 {
    /**
     * Formula according to the question.
     *
     * @param q day of the month
     * @param m month after converting January and February
     * @param k year of the century
     * @param j Century
     * @return the day of the week, where 0 is Saturday and 6 is Friday.
     */
    public static int day(int q, int m, int k, int j){
        return (q + (26 * (m + 1))/10 + k + k/4 + j/4 + 5*j) % 7;
    }

    public static void main(String[] args) {
        // 0 index = Saturday, index 6 = Friday.
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        while(true){
            try{
                Scanner console = new Scanner(System.in);
                System.out.print("Enter Year (e.g., 2012): ");
                int year = console.nextInt();
                System.out.print("Enter month (1-12): ");
                int month = console.nextInt();
                System.out.print("Enter the day of the month 1-31: ");
                int day = console.nextInt();

                if(day > 31 || day < 1){
                    throw new Exception("Day is outside of range");
                }
                if (month == 1 || month == 2){
                    month += 12;
                    year -= 1;
                }

                // Passes the arguments and divides and modulo the year according to the equation
                // Grabs the corresponding index of the Days..
                System.out.println("\nThe day is: " + days[day(day, month, year % 100, year/100 )]);
                break;
            }catch(Exception e){
                System.out.println("\nInvalid Input\n" + e + "\n");
            }
        }
    }
}
