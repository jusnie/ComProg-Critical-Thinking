import java.util.Scanner;
import java.util.Random;
 
    class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
 
        int secretNumber = random.nextInt(20) + 1;
 
        System.out.print(" Enter a number between 1 and 20: ");
        int playerNumber = scanner.nextInt();
        System.out.println();
        System.out.println(" o------------------------o");
 
        System.out.println(" Computer's Number: " + secretNumber);
        System.out.println(" o------------------------o");
        System.out.println(" Player's Number: " + playerNumber);
        System.out.println(" o------------------------o");
        System.out.println();
 
        if (playerNumber == secretNumber) {
            System.out.println(" o-------o");
            System.out.println("| You won!|");
            System.out.println(" o-------o");
        } else {
            System.out.println(" o---------o");
            System.out.println("| Nice Try! |");
            System.out.println(" o---------o");
        }
 
        scanner.close();
    }
}
