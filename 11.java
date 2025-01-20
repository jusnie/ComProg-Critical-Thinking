import java.util.Scanner;
 
    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print(" Enter value for a: ");
        double a = scanner.nextDouble();
        System.out.println(" o---------------o");
        System.out.print(" Enter value for b: ");
        double b = scanner.nextDouble();
        System.out.println(" o---------------o");
        System.out.print(" Enter value for c: ");
        double c = scanner.nextDouble();
        System.out.println(" o---------------o");
 
        // Calculate discriminant
        double discriminant = Math.pow(b, 2) - 4 * a * c;
 
        // Check discriminant value to find roots
        if (discriminant > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The roots are %.2f and %.2f%n", root1, root2);
        } else if (discriminant == 0) {
            // One real root
            double root = -b / (2 * a);
            System.out.printf("The root is %.2f%n", root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("The roots are %.2f + %.2fi and %.2f - %.2fi%n",
                              realPart, imaginaryPart, realPart, imaginaryPart);
        
        }
 
        scanner.close();
    }
}
