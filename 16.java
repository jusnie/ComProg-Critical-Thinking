import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.print("| Enter an angle in degrees: ");
        double angleInDegrees = scanner.nextDouble();
        System.out.println();

        // Converting degrees to radians
        double angleInRadians = Math.toRadians(angleInDegrees);

        // Computing sine, cosine, and tangent in this state
        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);

        // results
        System.out.println(" o-----------------o");
        System.out.println("| Sine: " + String.format("%.2f", sine));
        System.out.println("| Cosine: " + String.format("%.2f", cosine));
        System.out.println("| Tangent: " + String.format("%.2f", tangent));

        scanner.close();
    }
}
