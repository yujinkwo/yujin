import java.util.Scanner;

public class LittleQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer1, answer2, answer3, score = 0;
        System.out.println("Are you ready for a quiz?");
        System.out.println("Okay, here it comes!");
        System.out.println();
        System.out.println("Q1) What is the capital of British Columbia?");
        System.out.println("1) Edmonton");
        System.out.println("2) Whitehorse");
        System.out.println("3) Victoria");
        System.out.print("> ");
        answer1 = scanner.nextInt();
        if (answer1 == 3) {
            System.out.println("That's right!");
            score++;
        } else {
            System.out.println("Sorry, Victoria is the capital of British Columbia.");
        }
        System.out.println();
        System.out.println("Q2) Can you store the number in a variable of type int?");
        System.out.println("1) yes");
        System.out.println("2) no");
        System.out.print("> ");
        answer2 = scanner.nextInt();
        if (answer2 == 1) {
            System.out.println("That's right!");
            score++;
        } else{
            System.out.println("Sorry, ints can only store numbers.");
        }
        System.out.println();
        System.out.println("Q3) What  is the result of 3+9/3?");
        System.out.println("1) 4");
        System.out.println("2) 6");
        System.out.println("3) 12/3");
        System.out.print("> ");
        answer3 = scanner.nextInt();
        if (answer3 == 2) {
            System.out.println("That's right!");
            score++;
        } else {
            System.out.println("Sorry, 6 is the result.");
        }
        System.out.println();
        System.out.println("Overall, you got " + score + " out of 3 correct.");
        System.out.println("Thanks for playing!");
    }
}