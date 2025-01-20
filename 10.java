import java.util.Scanner;
 
    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Rectangular Prism
        System.out.println("  Rectangular Prism");
        System.out.println(" o-----------------o");
        System.out.print(" |Enter the length: ");
        double length = scanner.nextDouble();
        System.out.print(" |Enter the width: ");
        double width = scanner.nextDouble();
        System.out.print(" |Enter the height: ");
        double height = scanner.nextDouble();
        double prismVolume = length * width * height;
        System.out.println("o--------------------o");
        System.out.printf(" The volume is: %.2f%n", prismVolume);
        System.out.println("o--------------------o");
 
        // Sphere
        System.out.println("\n  Sphere");
        System.out.println(" o------o");
        System.out.print(" |Enter the radius: ");
        double radius = scanner.nextDouble();
        double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("o--------------------o");
        System.out.printf(" The volume is: %.2f%n", sphereVolume);
        System.out.println("o--------------------o");
 
        // Cube
        System.out.println("\n Cube");
        System.out.println(" o----o");
        System.out.print( " |Enter the length of each side: ");
        double side = scanner.nextDouble();
        System.out.println("o----------------------o");
        double cubeVolume = Math.pow(side, 3);
        System.out.printf(" |The volume is: %.2f%n", cubeVolume);
        System.out.println("o----------------------o");
 
        scanner.close();
    }
}
