import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the car's model number: ");
        int modelNumber = scanner.nextInt();

        if (modelNumber == 119 || modelNumber == 179 || modelNumber == 189 || 
            modelNumber == 195 || modelNumber == 221 || modelNumber == 780) {
                System.out.println("o------------------------o");
            System.out.println(" Your car is defective. It must be repaired.");
            System.out.println("o------------------------o");
        } else {
            System.out.println("o--------------------------o");
            System.out.println(" Your car is not defective.");
            System.out.println("o--------------------------o");
        }
    }
}
