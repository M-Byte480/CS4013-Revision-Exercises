import java.io.*;
import java.util.*;

public class Exercise3_17 {
    public static int randomNumber(){
        return (int) (Math.random()*3);
    }
    // 0 scissors 1 rock 2 paper
    public static String compare(int computer, int human){
        if(computer == human){
            return "Draw";
        } else if (computer == 0) {
            if(human == 1){
                return "Human Wins";
            }else{
                return "Computer Wins";
            }
        } else if(computer == 1){
            if(human == 0){
                return "Computer Wins";
            }else{
                return "Human Wins";
            }
        }else{
            if(human == 0){
                return "Human Wins";
            }else{
                return "Computer Wins";
            }
        }
    }

    public static void main(String[] args) {

        Boolean gotResult = false;
        while(!gotResult){
            try{
                Scanner consoleInput = new Scanner(System.in);
                System.out.print("Enter something:");
                String userInput = consoleInput.nextLine();
                int selection = Integer.parseInt(userInput);
                if(selection < 0 || selection > 2){
                    throw new Exception("");
                }
                int computerSelection = randomNumber();
                String result = compare(computerSelection,selection);
                System.out.println(result);
                gotResult = true;
                break;
            }catch(Exception e){
                System.out.println("\nInvalid input!\nPlease enter SOmething");
            }
        }
    }
}