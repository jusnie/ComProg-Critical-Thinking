import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" o-------------------------------o");

        // Inputting value
        System.out.print("| Enter initial bacteria amount: ");
        double n = scanner.nextDouble();
        System.out.print("| Enter a constant value for k: ");
        double k = scanner.nextDouble();
        System.out.print("| Enter the growth time period in hours: ");
        double t = scanner.nextDouble();

        // Calculating the final bacteria amount using the formula y = n * e^(k * t)
        double y = n * Math.exp(k * t);
        System.out.println("~~~~~~o-----------------------------------o~~~~~~");

        // The Result
        System.out.printf("| %.1f bacteria will be present after %.1f hours.%n", y, t);

        scanner.close();
    }
}
