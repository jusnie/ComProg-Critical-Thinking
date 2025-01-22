import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // inputing a value
        System.out.print("  Enter a value for X: ");
        double x = scanner.nextDouble();
        System.out.println(" o----------------------o");
        System.out.print("  Enter a value for Y: ");
        double y = scanner.nextDouble();

        // Calculating X^Y using the formula e^(y * log(x))
        double resultUsingFormula = Math.exp(y * Math.log(x));
        
        // Calculate X^Y 
        double resultUsingPow = Math.pow(x, y);

        // Display results also proper formatting
        System.out.printf(" The result from using the formula is: %.14f%n", resultUsingFormula);
        System.out.println("~~~~~~~~~~o-------------------------------------o~~~~~~~~~~");
        System.out.printf(" The result from using the Math pow() method is: %.1f%n", resultUsingPow);

        scanner.close();
    }
}
