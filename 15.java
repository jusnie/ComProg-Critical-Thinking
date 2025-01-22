import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu for selecting the operation
        System.out.println("|  1. Final Amount");
        System.out.println("|  2. Initial Amount");
        System.out.println("|  3. Constant (half-life)");
        System.out.println(" o-----------------------o");
        System.out.print(" enter 1, 2, or 3");
        System.out.println();
        System.out.print("| Find: ");
        int choice = scanner.nextInt();

        switch (choice) { // this way we need to encode the switch bcus it is case to case basis
            case 1:
                System.out.println(" o-----------------o");
                System.out.println();
                System.out.print("| Enter initial amount: ");
                double n1 = scanner.nextDouble();
                System.out.print("| Enter constant (k): ");
                double k1 = scanner.nextDouble();
                System.out.print("| Enter elapsed time: ");
                double t1 = scanner.nextDouble();
                double y1 = n1 * Math.exp(k1 * t1);
                System.out.printf("| Final amount: %.2f%n", y1);
                break;

            case 2:
                System.out.println(" o-----------------o");
                System.out.println();
                System.out.print("| Enter final amount: ");
                double y2 = scanner.nextDouble();
                System.out.print("| Enter constant (k): ");
                double k2 = scanner.nextDouble();
                System.out.print("| Enter elapsed time: ");
                double t2 = scanner.nextDouble();
                double n2 = y2 / Math.exp(k2 * t2);
                System.out.printf("| Initial amount: %.2f%n", n2);
                break;

            case 3:
                System.out.println(" o-----------------o");
                System.out.println();
                System.out.print("| Enter initial mass: ");
                double n3 = scanner.nextDouble();
                System.out.print("| Enter final mass: ");
                double y3 = scanner.nextDouble();
                System.out.print("| Enter elapsed time in years: ");
                double t3 = scanner.nextDouble();
                double k3 = Math.log(y3 / n3) / t3;
                System.out.printf("| Constant (half-life): %.5f%n", k3);
                break;

            default:
                System.out.println();
                System.out.print("| Invalid Entry. Select only 1, 2, or 3. for u to proceed |");
                
                break;
        }

        scanner.close();
    }
}
