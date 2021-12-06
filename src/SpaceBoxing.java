import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earthWeight;
        int planet;
        double planetWeight = 0.0;
        System.out.println("Please enter you current weight: ");
        earthWeight = scanner.nextInt();
        System.out.println("I have information for the following planets: ");
        System.out.println(" 1.Venus 2.Mars 3.Jupiter 4.Saturn 5.Uranus 6.Neptune");
        System.out.println();
        System.out.println("Which planet are you visiting?");
        planet = scanner.nextInt();
        if (planet == 1) {
            planetWeight = earthWeight * 0.78;
        } else if (planet == 2) {
            planetWeight = earthWeight * 0.39;
        } else if (planet == 3) {
            planetWeight = earthWeight * 2.65;
        } else if (planet == 4) {
            planetWeight = earthWeight * 1.17;
        } else if (planet == 5) {
            planetWeight = earthWeight * 1.05;
        } else if (planet == 6) {
            planetWeight = earthWeight * 1.23;
        } else {
            System.out.println("Invalid planet");
        }
        System.out.println("Your weight would be " + planetWeight + " pounds on that planet.");
    }
}