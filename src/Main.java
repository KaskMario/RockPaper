import java.util.Random;
import java.util.Scanner;

public class Main {
    static String answer;
    static int rand = new Random().nextInt(3);

    public static void main(String[] args) {

        System.out.print("Do you want to play? (y/n) : ");
        Scanner scan = new Scanner(System.in);
        if (scan.next().equalsIgnoreCase("y")) {
            System.out.println("Lets play");


            do {
                System.out.print("Choose rock, paper or scissors: ");
                answer = scan.next();
            } while (!answer.equalsIgnoreCase("rock") && !answer.equalsIgnoreCase("paper") && !answer.equalsIgnoreCase("scissors"));
            System.out.print("CPU chose: ");
            String cpuChoice = cpuTurn();
            check(cpuChoice);
        }else {
            scan.close();
        }

    }


    static String  cpuTurn() {
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
        //String cpusChoice = String.valueOf(rand);
        if (answer.toLowerCase().equals(cpuChoice)) {
            System.out.println(aTie);
            //  } if (answer.equalsIgnoreCase("rock") && cpusChoice.equals("1")){
            //      System.out.println(aTie);
            //  } if (answer.equalsIgnoreCase("scissors") && cpusChoice.equals("2")){
            //      System.out.println(aTie);
        }
        if (answer.equalsIgnoreCase("paper") && cpuChoice.equals("1")) {
            System.out.println(aWin);
            //  }// if (answer.equalsIgnoreCase("paper") && cpusChoice.equals("2")) {
            //  System.out.println(aLoss);
            //  }// if (answer.equalsIgnoreCase("rock") && cpusChoice.equals("0")) {
            //  System.out.println(aLoss);
        }
        if (answer.equalsIgnoreCase("rock") && cpuChoice.equals("2")) {
            System.out.println(aWin);
        }
        if (answer.equalsIgnoreCase("scissors") && cpuChoice.equals("0")) {
            System.out.println(aWin);
            //  }//if (answer.equalsIgnoreCase("scissors") && cpusChoice.equals("1")) {
            //  System.out.println(aLoss);
        } else {
            System.out.println(aLoss);

        }


    }
}

