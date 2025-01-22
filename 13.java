import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inputing the value
        System.out.println("|-------------------");
        System.out.print("| Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("| Interest Rate: ");
        double annualRate = scanner.nextDouble();
        System.out.print("| Number of monthly payments: ");
        int months = scanner.nextInt();

        // Monthly interest rate
        double monthlyRate = annualRate / 12;

        // monthly payment
        double monthlyPayment = (principal * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months));
        System.out.println("|-------------------------------");

        //outcome
        System.out.printf("| The monthly payment is $%.2f%n", monthlyPayment);
        System.out.println("| o--------------------------o");
        

        scanner.close();
    }
}
