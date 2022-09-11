import java.util.Scanner;

public class Exercise3_21 {
    public static int day(int q, int m, int k, int j){
        return (q + (26 * (m + 1))/10 + k + k/4 + j/4 + 5*j) % 7;
    }

    public static void main(String[] args) {
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

                System.out.println("\nThe day is: " + days[day(day, month, year % 100, year/100 )]);
                break;
            }catch(Exception e){
                System.out.println("\nInvalid Input\n" + e + "\n");
            }
        }
    }
}
