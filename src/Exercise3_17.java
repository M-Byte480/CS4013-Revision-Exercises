import java.util.*;

public class Exercise3_17 {
    /**
     *
     * @return a random number between 0 - 2
     */
    private static int randomNumber(){
        return (int) (Math.random()*3);
    }

    /**
     * 0 scissors 1 rock 2 paper
     * @param computer Takes a computer generated argument
     * @param human Takes a human generated arguement
     * @return returns the winner!
     */
    private static String compare(int computer, int human){

        // Output constructor
        String output = "The computer is ";

        if(computer == 0){
            output += "scissors.";
        } else if (computer == 1) {
            output += "rock.";
        }else {
            output += "paper.";
        }

        output += " You are ";

        if(human == 0){
            output += "scissors ";
        } else if (human == 1) {
            output += "rock ";
        }else{
            output += "paper ";
        }

        if(computer == human){
            output += "too. It is a draw.";
        } else if (computer == 0) {
            if(human == 1){
                output += ". You Win";
            }else{
                output += ". Computer Wins";
            }
        } else if(computer == 1){
            if(human == 0){
                output += ". Computer Win";
            }else{
                output += ". You Win";
            }
        }else{
            if(human == 0){
                output += ". You Win";
            }else{
                output += ". Computer Wins";
            }
        }
        return output;
    }

    public static void main(String[] args) {
        // While-Try-Catch
        boolean gotResult = false;
        while(!gotResult){
            try{
                Scanner consoleInput = new Scanner(System.in);
                System.out.print("Scissors (0) Rock (1) Paper (2): ");

                int selection = consoleInput.nextInt();

                if(selection < 0 || selection > 2){
                    throw new Exception("");
                }
                int computerSelection = randomNumber();

                String result = compare(computerSelection,selection);

                System.out.println(result);
                gotResult = true;

            }catch(Exception e){

                System.out.println("\nInvalid input!\nPlease enter 0, 1 or 2");

            }
        }
    }
}