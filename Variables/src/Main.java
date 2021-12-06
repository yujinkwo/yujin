import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Ok, " + name + ", how old are you?");
        age = scanner.nextInt();
        if(age < 16){
            System.out.println("You can't drive ");
        } else if (age < 17) {
            System.out.println("You can drive but not vote");
        }
        else if (age < 18) {
            System.out.println("You can vote but not rent a car");
        }
        if (age < 25) {
            System.out.println("You can do pretty much anything");
        }
    }
}
