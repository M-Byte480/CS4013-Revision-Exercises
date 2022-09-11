package NotNeeded;

public class Exercise1_4 {
    public static void main(String[] args) {
        int spaces = 7;
        for (int title = 1; title  <= 3; title++) {
            if (title != 1) {
                System.out.printf("%-"+spaces+"s", "a*" + title);
            }else{
                System.out.printf("%-"+spaces+"s", "a");
            }
        }
        System.out.println();
        for (int row = 1; row < 5; row++) {
            for (int column = 1; column < 4; column++) {
                System.out.printf("%-"+spaces+"d",row*column);
            }
            System.out.println();
        }
    }
}
