import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int num;
        String playerChoice = "";
        String computerChoice = "";

        int playerScore = 0;
        int computerScore = 0;

        while (true) {
            System.out.println("Choose rock paper or scissors.");
            System.out.println("'r' for rock, 'p' for paper and 's' for scissors. To exit choose 'x'");

            playerChoice = scan.nextLine();

            if (playerChoice.equals("x")) {
                System.out.println("Exit!");
                break;
            }

            if (!playerChoice.equals("r") && !playerChoice.equals("p") && !playerChoice.equals("s")) {
                System.out.println("Invalid selection");
                continue;
            }

            num = rand.nextInt(3);

            if (num == 0) {
                computerChoice = "r";
            } else if (num == 1) {
                computerChoice = "p";
            } else if (num == 2) {
                computerChoice = "s";
            }

            if (computerChoice.equals("s")) {
                System.out.println("The computer choose scissors.");
            } else if (computerChoice.equals("r")) {
                System.out.println("The computer choose rock.");
            } else if (computerChoice.equals("p")) {
                System.out.println("The computer choose paper.");
            }

            if (playerChoice.equals("r") && computerChoice.equals("s")) {
                System.out.println("You Win!");
                playerScore++;
            } else if (playerChoice.equals("p") && computerChoice.equals("r")) {
                System.out.println("You Win!");
                playerScore++;
            } else if (playerChoice.equals("r") && computerChoice.equals("p")) {
                System.out.println("You Lose!");
                computerScore++;
            } else if (playerChoice.equals("p") && computerChoice.equals("s")) {
                System.out.println("You Lose!");
                computerScore++;
            } else if (playerChoice.equals("s") && computerChoice.equals("r")) {
                System.out.println("You Lose!");
                computerScore++;
            } else if (playerChoice.equals("s") && computerChoice.equals("p")) {
                System.out.println("You Lose!");
                computerScore++;
            } else if (playerChoice.equals(computerChoice)) {
                System.out.println("Draw!");
            }

            System.out.println("Player : Computer = " + playerScore + " : " + computerScore);
        }
    }
}