import java.util.Scanner;

    class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("   o----------------------------------o");
        System.out.print(" Enter the number of copies to be printed: ");
        int copies = scanner.nextInt();
        double pricePerCopy;

        if (copies <= 99) {
            pricePerCopy = 0.30;
        } else if (copies <= 499) {
            pricePerCopy = 0.28;
        } else if (copies <= 749) {
            pricePerCopy = 0.27;
        } else if (copies <= 1000) {
            pricePerCopy = 0.26;
        } else {
            pricePerCopy = 0.25;
        }

        double totalCost = copies * pricePerCopy;
        System.out.println("   o----------------------------------o");
        System.out.printf("   Price per copy is: $%.2f%n", pricePerCopy);
        System.out.println("   o----------------------------------o");
        System.out.printf("   Total cost is: $%.2f%n", totalCost);
    }
}
