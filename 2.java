import java.util.Scanner;

    class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" o-------------------------------o");

        System.out.print(" Enter package weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.println(" o-------------------------------o");
        System.out.print(" Enter package length in centimeters: ");
        double length = scanner.nextDouble();
        System.out.println(" o-------------------------------o");
        System.out.print(" Enter package width in centimeters: ");
        double width = scanner.nextDouble();
        System.out.println(" o-------------------------------o");
        System.out.print(" Enter package height in centimeters: ");
        double height = scanner.nextDouble();

        double volume = length * width * height / 1000000; 

        if (weight > 27 && volume > 0.1) {
        System.out.println(" o--------------------------o");     
            System.out.println(" Too heavy and too large.");
        } else if (weight > 27) {
            System.out.println(" o--------o");
            System.out.println(" Too heavy.");
        } else if (volume > 0.1) {
            System.out.println(" ---------o"); 
            System.out.println(" Too large.");
            
        } else {
            System.out.println(" Package is accepted.");
        }
    }
}
