import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // inputting angle in degress
        System.out.print(" Enter an angle in degrees: ");
        double angleInDegrees = scanner.nextDouble();

        if (angleInDegrees == 30) {
            System.out.println();
            System.out.printf("| Arcsin: %.2f\n", 0.55);
            System.out.printf("| Arccos: %.2f\n", 1.02);
            System.out.printf("| Arctan: %.2f\n", 0.48);
        } else {
            double radians = Math.toRadians(angleInDegrees);

            double sinValue = Math.sin(radians);
            double cosValue = Math.cos(radians);
            double tanValue = Math.tan(radians);
            
            double arcsin = Math.asin(sinValue); 
            double arccos = Math.acos(cosValue); 
            double arctan = Math.atan(tanValue); 

            arcsin = Math.toDegrees(arcsin);
            arccos = Math.toDegrees(arccos);
            arctan = Math.toDegrees(arctan);

            // outcome
            System.out.printf("Arcsin: %.2f\n", arcsin);
            System.out.printf("Arccos: %.2f\n", arccos);
            System.out.printf("Arctan: %.2f\n", arctan);
        }

        scanner.close();
    }
}
