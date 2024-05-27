import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    static String answer;
    static int gameCount;

    public static void main(String[] args) {
         rockPaperScissors();


    }
    static void rockPaperScissors(){
        scan = new Scanner(System.in);
        while (gameCount == 0) {
            System.out.print("Do you want to play? (y/n) : ");
            String userInput = scan.next();

            if (userInput.equalsIgnoreCase("y")) {
                System.out.println("Lets play");
                gameCount = 1;
                do {
                    System.out.print("Choose rock, paper or scissors: ");
                    answer = scan.next();
                } while (!answer.equalsIgnoreCase("rock") && !answer.equalsIgnoreCase("paper") && !answer.equalsIgnoreCase("scissors"));
                System.out.print("CPU chose: ");
                String cpuChoice = cpuTurn();
                check(cpuChoice);
            } else if (userInput.equalsIgnoreCase("n")) {
                scan.close();
                break;
            } else {
               gameCount = 0;
            }

        }
    }


    static String cpuTurn() {
        int rand = new Random().nextInt(3);
        String cpuChoice= "";
        switch (rand) {
            case 0 -> cpuChoice = "paper";
            case 1 -> cpuChoice = "rock";
            case 2 -> cpuChoice = "scissors";

        } System.out.println(cpuChoice);
        return cpuChoice;
    }

    static void check(String cpuChoice) {
        String aWin = "You Won!!";
        String aLoss = "You lost, CPU WON!!";
        String aTie = "Its a tie!!";
        if (answer.toLowerCase().equals(cpuChoice)) {
            System.out.println(aTie);
        }
        else if (answer.equalsIgnoreCase("paper") && cpuChoice.equals("rock")) {
            System.out.println(aWin);
        }
        else if (answer.equalsIgnoreCase("rock") && cpuChoice.equals("scissors")) {
            System.out.println(aWin);
        }
        else if (answer.equalsIgnoreCase("scissors") && cpuChoice.equals("paper")) {
            System.out.println(aWin);
        } else {
            System.out.println(aLoss);

        }

       gameCount = 0;
    }
}

