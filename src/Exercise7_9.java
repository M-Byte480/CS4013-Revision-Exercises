import java.util.Scanner;

public class Exercise7_9 {
    /**
     * Plays a game of tic-tac-toe.
     * Creates a 2D array, displays it, checks user input and returns the state of winning.
     */
    private static void ticTacToe(){
        String board =
                """
                   -------------------
                   |  %s  |  %s  |  %s  |
                   |  %s  |  %s  |  %s  |
                   |  %s  |  %s  |  %s  |
                   -------------------
                   """;
        String[][] playerVSplayer = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                playerVSplayer[i][j] = " ";
            }
        }
        int winner = 0;
        int row;
        int column;
        int turn = 1;
        int playCount = 0;

        System.out.printf(board, (Object[]) convertArray(playerVSplayer));

        while(winner == 0){
            try{
                Scanner terminal = new Scanner(System.in);
                System.out.printf("Enter a row (0, 1, 2) for Player %S: ", ((turn == 1) ? "X" : "O"));
                row = terminal.nextInt();
                System.out.printf("Enter a column (0, 1, 2) for Player %S: ", ((turn == 1) ? "X" : "O"));
                column = terminal.nextInt();
                playCount++;
                if(playerVSplayer[row][column].equals(" ")){
                    playerVSplayer[row][column] = ((turn == 1) ? "X" : "O");
                }else{
                    System.out.println("Invalid input. Player must select a different cell.");
                    continue;
                }
                winner = checkWinner(playerVSplayer);
                System.out.printf(board, (Object[]) convertArray(playerVSplayer));
                if(winner != 0){
                    System.out.printf("Player %S Won!\n", (winner == 1)? "X" :"O");
                } else if (playCount == 9) {
                    System.out.println("Draw!");
                    winner = -1;
                }
                turn *= -1;
            }catch (Exception e){
                System.out.println("Something went wrong...\n");
            }
        }
    }

    /**
     * Takes a 2D array and returns it in 1D
     * @param myArray 2D String Array
     * @return 1D array
     */
    private static String[] convertArray(String[][] myArray){
        String[] convertedArray = new String[myArray.length * myArray[0].length];
        int i = 0;
        for (String[] array : myArray){
            for (String element : array) {
                convertedArray[i] = element;
                i++;
            }
        }
        return convertedArray;
    }

    /**
     * @param input of 2-D array, representing the tic-tac-toe board
     * @return 0 for no winner yet, 1 for playerX, 2 for playerO.
     */
    private static int checkWinner(String[][] input){
        int winner = 0;
        for (int i = 0; i < 3; i++) {
            // Horizontal Permutations
            if(input[i][0].equals(input[i][1]) && input[i][2].equals(input[i][1])){
                return winnerType(input[i][0]);

            }
            // Vertical permutations
            if(input[0][i].equals(input[1][i]) && input[1][i].equals(input[2][i])){
                return winnerType(input[0][i]);
            }
        }
        String center = input[1][1];
        if(input[0][0].equals(center) && input[2][2].equals(center)){
            return winnerType(center);
        } else if (input[2][0].equals(center) && input[0][2].equals(center)) {
            return winnerType(center);
        }

        return winner;
    }

    /**
     * Checks the winning cell and returns int accordingly
     * @param player  "X" or "O" or " "
     * @return corresponding value 1 2 or 0
     */
    private static int winnerType(String player) {
        if(player.equals("X")){
            return 1;
        } else if(player.equals("O")) {
            return 2;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        ticTacToe();
    }
}
